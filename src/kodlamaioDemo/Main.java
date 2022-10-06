package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.TeacherManager;
import kodlamaioDemo.core.DatabaseLogger;
import kodlamaioDemo.core.FileLogger;
import kodlamaioDemo.core.Logger;
import kodlamaioDemo.core.MailLogger;
import kodlamaioDemo.core.SmsLogger;
import kodlamaioDemo.dataAccess.JdbcCategoryDao;
import kodlamaioDemo.dataAccess.JdbcCourseDao;
import kodlamaioDemo.dataAccess.JdbcTeacherDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new SmsLogger(), new MailLogger(), new DatabaseLogger(), new FileLogger() };

		Teacher teacher1 = new Teacher(1, "Emir");

		Category category1 = new Category(1, "Java");

		Course course1 = new Course(1, "Java ile Programlama", "Temelden üst düzeye Java eğitimi", 1000.0);

		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teacherManager.add(teacher1);

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
	}
}