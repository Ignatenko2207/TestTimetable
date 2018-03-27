package org.itstep.dao;

import java.security.acl.Group;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface GroupDAO extends JpaRepository<Group, String>{
		
		List<Group> findAllByGroup(String courseName);
		
}
