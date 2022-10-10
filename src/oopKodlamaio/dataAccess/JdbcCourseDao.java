package oopKodlamaio.dataAccess;

import java.time.LocalDate;
import java.util.ArrayList;

import oopKodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {

	String[] categoryIds = {"159357", "654852", "7598623", "5125784"};
	ArrayList<Course> courses = new ArrayList<Course>();
	
	public JdbcCourseDao() {
		courses.add(new Course("2ddedc39-31b1-4857-45a9-cc4de2658524", "C# 101-201-301", "Learn how to develop apps through C#!", "bfe5a60c-7123-4ba6-9cac-46afb545d5d6", categoryIds, 15, LocalDate.now(), false));
		courses.add(new Course("3tyedc23-21b6-8232-65j4-tg4de2218753", "Javascript 101-201-301", "Learn how to develop apps through Javascript#!", "bfe5a60c-7123-4ba6-9cac-46afb545d5d6", categoryIds, 12, LocalDate.now(), false));
		courses.add(new Course("8uoedc49-77i1-2367-40a4-ct4de7899874", "Go 101-201-301", "Learn how to develop apps through Go#!", "bfe5a60c-7123-4ba6-9cac-46afb545d5d6", categoryIds, 15, LocalDate.now(), false));
	}
	
	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Course:" + course.getHeader() + " added to system!(JDBC)");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course:" + course.getHeader() + " updated!(JDBC)");
		
	}

	@Override
	public void delete(String id) {
		System.out.println("Course removed from system!(JDBC)");
		
	}

	@Override
	public Course getByName(String name) {
		Course course = new Course();
		for(Course c : courses) {
			if(c.getHeader().equalsIgnoreCase(name)) {
				course = c;
				return course;
			}
		}
		return course;
	}

}
