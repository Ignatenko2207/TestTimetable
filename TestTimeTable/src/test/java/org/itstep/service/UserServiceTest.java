package org.itstep.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.itstep.ApplicationRunner;
import org.itstep.dao.UserDAO;
import org.itstep.model.Group;
import org.itstep.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationRunner.class)
public class UserServiceTest {
	@Autowired
	UserService userService;

	@MockBean
	UserDAO userDao;

	@Test
	public void testFindAllByGroup() {

		List<User> users = new ArrayList<User>();
		Group group = new Group();

		Mockito.when(userDao.findAllByGroup(group)).thenReturn(users);
		List<User> userFromDB = userService.findAllByGroup(group);
		assertNotNull(userFromDB);
	}

}
