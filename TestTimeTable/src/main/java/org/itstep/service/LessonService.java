package org.itstep.service;

import java.util.List;

import org.itstep.model.Group;
import org.itstep.model.Lesson;

public interface LessonService {

	Lesson save(Lesson lesson);
	
	Lesson update(Lesson lesson);
	
	Lesson get(Integer id);
	
	List<Lesson> findAllByStartTime(Long startPeriod, Long endPeriod);
	
	List<Lesson> findAllByStartTime(Long startPeriod, Long endPeriod, Group group);
	
	void delete(Integer id);
}
