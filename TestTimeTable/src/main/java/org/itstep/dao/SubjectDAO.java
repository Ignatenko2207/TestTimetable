package org.itstep.dao;

import java.util.List;

import org.itstep.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDAO extends JpaRepository<Subject, String>{
	
	List<Subject> findAllByGroup(String subjectName);
	
} 