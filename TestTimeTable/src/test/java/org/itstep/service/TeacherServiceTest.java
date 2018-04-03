package org.itstep.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.itstep.ApplicationRunner;
import org.itstep.dao.TeacherDAO;
import org.itstep.model.Subject;
import org.itstep.model.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationRunner.class})
public class TeacherServiceTest {
	
	@Autowired
	TeacherService teaherService;
	
	@Autowired
	TeacherDAO teacherDao;
	
	@Autowired
	Subject subject;
	
	@Autowired
	Teacher teacher;

	@Test
	public void testFindAllBySubject() {
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(teacher);
		Mockito.when(teacherDao.findAllBySubject(subject)).thenReturn(teachers);
		
		List<Teacher> teachersFromDB = teaherService.findAllBySubject(subject);
		
		assertNotNull(teachersFromDB);
	}

}
