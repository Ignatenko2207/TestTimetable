package org.itstep.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.itstep.ApplicationRunner;
import org.itstep.dao.LessonDAO;
import org.itstep.model.Lesson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationRunner.class })
public class LessonServiceTest {

	@Autowired
	SubjectService lessonService;

	@Autowired
	LessonDAO lessonDao;

	@Test
	public void testFindAllByStartTimeLongLong() {

		List<Lesson> lessons = new ArrayList<Lesson>();
		Mockito.when(lessonDao.findAllByStartTime(123456L, 654321L)).thenReturn(lessons);

		List<Lesson> lessonsFromDB = lessonService.findAllByStartTime(123456L, 654321L);

		assertNotNull(lessonsFromDB);
	}

	@Test
	public void testFindAllByStartTimeLongLongGroup() {

	}

}