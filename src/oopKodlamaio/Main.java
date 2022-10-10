package oopKodlamaio;

import java.time.LocalDate;

import oopKodlamaio.business.CategoryManager;
import oopKodlamaio.business.CourseManager;
import oopKodlamaio.business.InstructorManager;
import oopKodlamaio.core.logging.DatabaseLogger;
import oopKodlamaio.core.logging.FileLogger;
import oopKodlamaio.core.logging.Logger;
import oopKodlamaio.core.logging.MailLogger;
import oopKodlamaio.dataAccess.HibernateCategoryDao;
import oopKodlamaio.dataAccess.HibernateCourseDao;
import oopKodlamaio.dataAccess.HibernateInstructorDao;
import oopKodlamaio.dataAccess.JdbcCategoryDao;
import oopKodlamaio.dataAccess.JdbcCourseDao;
import oopKodlamaio.dataAccess.JdbcInstructorDao;
import oopKodlamaio.entities.Category;
import oopKodlamaio.entities.Course;
import oopKodlamaio.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		String[] categoryIds = {"159357", "654852", "7598623", "5125784"};
		Course course = new Course("1beedc39-31b1-4823-96a9-ac4de2654234", "Java 101-201-301", "Learn how to develop apps through Java!", "bfe5a60c-7123-4ba6-9cac-46afb545d5d6", categoryIds, 150, LocalDate.now(), false);
		Course course2 = new Course("1beedc39-31b1-4823-96a9-ac4de2654234", "C# 101-201-301", "Learn how to develop apps through Java!", "bfe5a60c-7123-4ba6-9cac-46afb545d5d6", categoryIds, 150, LocalDate.now(), false);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		CourseManager courseManager2 = new CourseManager(new JdbcCourseDao(), loggers);
		
		Instructor instructor = new Instructor("1bb388a6-af4a-4be1-9917-b234f8ac74eb", "Emrecan", "Ay", "https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3", "Yazılım geliştirmeci olarak çalışmaktayım.", LocalDate.now(), false);
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorDao(), loggers);
		
		Category category  = new Category("dbaee4c8-63f3-4487-a93b-c20e9f8d441b", "AI Development", LocalDate.now(), false);
		Category category2  = new Category("dbaee4c8-63f3-4487-a93b-c20e9f8d441b", "Game Development", LocalDate.now(), false);
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(), loggers);
		
		try {
			courseManager.add(course);
			courseManager2.add(course2);
			//courseManager.add(course2); //conflict example
			
			instructorManager.add(instructor);
			instructorManager2.add(instructor);
			
			categoryManager.add(category);
			categoryManager2.add(category2);
			//categoryManager.add(category2); //conflict example
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
		
		
		
	}
}
