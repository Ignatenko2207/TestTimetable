package org.itstep.dao;

import java.util.List;

import org.itstep.model.Subject;
import org.itstep.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public class TeacherDAO{
	
	public Teacher save(Teacher teacher) {
		
		return null;
	}
	
	public Teacher update(Teacher teacher) {
		
		return null;
	}
	
	public Teacher getOne(String login) {
		return null;
	}
	
	public void delete(String login) {
	}
	
	public List<Teacher> findAllBySubject(Subject subject) {
		return null;
	}

}

//@Repository
//public interface TeacherDAO extends JpaRepository<Teacher, String> {
//	
//	List<Teacher> findAllBySubject(Subject subject);
//
//}
