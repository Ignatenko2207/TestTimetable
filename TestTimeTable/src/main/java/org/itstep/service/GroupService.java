package org.itstep.service;

import java.util.List;

import org.itstep.model.Group;

public interface GroupService {
	
	Group save(Group group);
	
	Group update(Group group);
	
	Group get(String name);
	
	List<Group> findAllByCourse(String course);
	
	List<Group> findAllByName(String name, String course);
	
	void delete(String name);

}
