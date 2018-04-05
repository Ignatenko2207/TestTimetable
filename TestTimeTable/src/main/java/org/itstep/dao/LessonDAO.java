package org.itstep.dao;

import java.util.List;

import org.itstep.model.Group;
import org.itstep.model.Lesson;
import org.springframework.stereotype.Repository;

@Repository
public class LessonDAO {

	public Lesson save(Lesson lesson) {
		return null;
	}

	public Lesson update(Lesson lesson) {
		return null;
	}

	public Lesson getOne(Integer id) {
		return null;
	}

	public List<Lesson> findAllByStartTime(Long startPeriod, Long endPeriod) {
		return null;
	}

	public void delete(Integer id) {
		
	}

	public List<Lesson> findAllByStartTime(Long startPeriod, Long endPeriod, Group group) {
		return null;
	}


}

// @Repository
// public interface LessonDAO extends JpaRepository<Lesson, Integer> {
//
// List<Lesson> findAllByStartTime(Long startTime, Long endtime);
//
// List<Lesson> findAllByStartTime(Long startTime, Long endtime, Group group);
//
// }