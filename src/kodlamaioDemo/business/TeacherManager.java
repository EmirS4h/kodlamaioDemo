package kodlamaioDemo.business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class TeacherManager {
	private TeacherDao teacherDao;
	private Logger[] loggers;

	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		super();
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}

	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		for (Logger logger : loggers) {
			logger.log(teacher.getName());
		}
	}

}
