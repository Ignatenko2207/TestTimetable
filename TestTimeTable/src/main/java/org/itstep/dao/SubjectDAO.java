package org.itstep.dao;

import java.util.List;

import org.itstep.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public class SubjectDAO{
	public Subject save(Subject subject) {
		
		return null;
	}

	public Subject update(Subject subject) {
		return null;
	}

	public Subject getOne(String name) {
		return null;
	}

	public void delete(String name) {
		
	}
} 
//@Repository
//public interface SubjectDAO extends JpaRepository<Subject, String>{
//	
//} 