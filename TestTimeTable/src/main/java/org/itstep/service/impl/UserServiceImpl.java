package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.UserDAO;
import org.itstep.model.Group;
import org.itstep.model.User;
import org.itstep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;

	public User save(User user) {
		if (userDao.getOne(user.getLogin()) == null) {
			return userDao.save(user);
		}
		return null;

	}

	public User update(User user) {
		if (userDao.getOne(user.getLogin()) != null) {
			return userDao.save(user);
		}
		return null;
	}

	public User get(String login) {
		return userDao.getOne(login);
	}

	public List<User> findAllByGroup(Group group) {
		return userDao.findAllByGroup(group);
	}

	public void delete(String login) {
		userDao.delete(login);
	}

}
