package org.itstep.service;

import java.util.List;
import org.itstep.model.Group;
import org.itstep.model.User;

public interface UserService {

	User save (User user);
	
	User update (User user);
	
	User get (String login);
	
	List<User> findAllByGroup(Group group);
	
	void delete (String login);

}