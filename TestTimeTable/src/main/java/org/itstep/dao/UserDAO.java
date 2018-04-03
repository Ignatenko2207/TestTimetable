package org.itstep.dao;

import java.util.List;

import org.itstep.model.Group;
import org.itstep.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAO{


	public User save(User user) {
		
		return null;

	}

	public User update(User user) {
		
		return null;
	}

	public User getOne(String login) {
		return null;
	}

	public List<User> findAllByGroup(Group group) {
		return null;
	}

	public void delete(String login) {
	}
}

//@Repository
//public interface UserDAO extends JpaRepository<User, String>{
//
//	List<User> findAllByGroup(Group group);
//}
