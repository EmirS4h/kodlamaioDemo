package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Hibernate ile eklendi " + teacher.getName());
	}

}
