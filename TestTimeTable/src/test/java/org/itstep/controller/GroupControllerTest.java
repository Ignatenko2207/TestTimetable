package org.itstep.controller;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.itstep.ApplicationRunner;
import org.itstep.dao.GroupDAO;
import org.itstep.model.Group;
import org.itstep.service.GroupService;
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

import ch.qos.logback.core.net.server.ConcurrentServerRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class GroupControllerTest {
	@Autowired
	TestRestTemplate restTempLate;

	@MockBean
	GroupService groupService;

	@Test
	public void testSave() throws URISyntaxException {
		Group group = new Group();
		
		group.setCourse("first");
		
		Mockito.when(groupService.save(Mockito.any(Group.class))).thenReturn(group);
		RequestEntity<Group> request = new RequestEntity<Group>(group, HttpMethod.POST, new URI("/group"));
		ResponseEntity<Group> response = restTempLate.exchange(request, Group.class);
		
		assertEquals(HttpStatus.OK,  response.getStatusCode());
		assertEquals("first", response.getBody().getCourse());
		
		Mockito.verify(groupService, Mockito.times(1)).save(Mockito.any(Group.class));
				
	}

	@Test
	public void testUpdate() {

	}

	@Test
	public void testGetOne() {

	}

}
