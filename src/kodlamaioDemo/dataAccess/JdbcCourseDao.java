package kodlamaioDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	private List<Course> courses;
	
	public JdbcCourseDao() {
		courses = new ArrayList<Course>();
	}
	
	@Override
	public void add(Course course) {
		this.courses.add(course);
		System.out.println("JDBC ile eklendi " + course.getCourseName());
	}

	@Override
	public List<Course> getAll() {
		return this.courses;
	}

}
