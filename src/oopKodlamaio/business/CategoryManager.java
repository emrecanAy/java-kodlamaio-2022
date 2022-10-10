package oopKodlamaio.business;

import oopKodlamaio.core.logging.Logger;
import oopKodlamaio.dataAccess.CategoryDao;
import oopKodlamaio.entities.Category;

public class CategoryManager {
	
	private CategoryDao _categoryDao;
	private Logger[] _loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this._categoryDao = categoryDao;
		this._loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		if(checkIfCategoryExist(category.getName())) {
			throw new Exception("The course has already added to system!");
		}
		else {
			this._categoryDao.add(category);
			for(Logger logger : _loggers) {
				logger.log(category.getName());
			}
		}
	}
	
	public void update(Category category) {
		this._categoryDao.update(category);
	}
	
	public void delete(String id) {
		this._categoryDao.delete(id);
	}
	
	public boolean checkIfCategoryExist(String name) {
		if(this._categoryDao.getByName(name).getName() != null) {
			return true;
		}
		return false;
	}

	
	

}
