package kodlamaioDemo.business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0.0) {
			throw new Exception("Kurs fiyatı 0 TL'den az olamaz!");
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
