package org.itstep.dao;

import java.util.List;

import org.itstep.model.Group;
import org.itstep.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonDAO extends JpaRepository<Lesson, Integer> {

	List<Lesson> findAllByStarTime(Long startTime, Long endtime);
	List<Lesson> findAllByStarTime(Long startTime, Long endtime,  Group group);
	
}