package oopKodlamaio.business;

import oopKodlamaio.core.logging.Logger;
import oopKodlamaio.dataAccess.CourseDao;
import oopKodlamaio.entities.Course;

public class CourseManager {

	private CourseDao _courseDao;
	private Logger[] _loggers;
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this._courseDao = courseDao;
		this._loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(checkIfCourseExist(course.getHeader())) {
			throw new Exception("The course has already added to system!");
		}
		else if(checkIfPriceLessThanZero(course.getPrice())) {
			throw new Exception("The course price cannot get negative values!");
		}
		else {
			this._courseDao.add(course);
			for(Logger logger : _loggers) {
				logger.log(course.getHeader());
			}
		}
	}
	
	public void update(Course course) {
		this._courseDao.update(course);
	}
	
	public void delete(String id) {
		this._courseDao.delete(id);
	}
	
	public boolean checkIfCourseExist(String name) {
		if(this._courseDao.getByName(name).getHeader() != null) {
			return true;
		}
		return false;
	}
	
	public boolean checkIfPriceLessThanZero(int price) {
		if(price < 0) {
			return true;
		}
		return false;
	}
	
}
