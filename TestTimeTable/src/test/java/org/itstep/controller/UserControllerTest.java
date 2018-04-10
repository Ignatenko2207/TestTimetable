package org.itstep.controller;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.itstep.ApplicationRunner;
import org.itstep.model.User;
import org.itstep.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
	@Autowired
	TestRestTemplate restTemplate;
	
	@MockBean
	UserService userService;

	@Test
	public void testSave()throws URISyntaxException {
		
	User user=new User();
	user.setLogin("first");
	
	
	Mockito.when(userService.save(Mockito.any(User.class))).thenReturn(user);	
		
	RequestEntity<User> request = new RequestEntity<User>(user, HttpMethod.POST, new URI("/user"));
	ResponseEntity<User> response = restTemplate.exchange(request, User.class);	
	
	assertEquals(HttpStatus.OK, response.getStatusCode()); 
	assertEquals("first", response.getBody().getLogin());
	
	Mockito.verify(userService , Mockito.times(1)).save(Mockito.any(User.class));
		
		
	}

	@Test
	public void testUpdate() {
	
	}

	@Test
	public void testGetOne() {
	}

}
