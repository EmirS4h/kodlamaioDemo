package kodlamaioDemo.dataAccess;

import java.util.List;

import kodlamaioDemo.entities.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
}
