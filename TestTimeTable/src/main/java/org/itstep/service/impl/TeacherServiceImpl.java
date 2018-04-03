package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.TeacherDAO;
import org.itstep.model.Lesson;
import org.itstep.model.Subject;
import org.itstep.model.Teacher;
import org.itstep.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherDAO teacherDao;
	
	public Teacher save(Teacher teacher) {
		if(teacherDao.getOne(teacher.getLogin()) == null) {
			return teacherDao.save(teacher);
		}
		return null;
	}
	
	public Teacher update(Teacher teacher) {
		if(teacherDao.getOne(teacher.getLogin()) == null) {
			return teacherDao.save(teacher);
		}
		return null;
	}
	
	public Teacher get(String login) {
		return teacherDao.getOne(login);
	}
	
	public void delete(String login) {
		teacherDao.delete(login);
	}
	
	public List<Teacher> findAllBySubject(Subject subject) {
		return teacherDao.findAllBySubject(subject);
	}

}