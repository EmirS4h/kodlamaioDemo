package kodlamaioDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	private List<Course> courses;
	
	public HibernateCourseDao() {
		courses = new ArrayList<Course>();
	}

	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Hibernate ile eklendi " + course.getCourseName());
	}

	@Override
	public List<Course> getAll() {
		return this.courses;
	}

}
