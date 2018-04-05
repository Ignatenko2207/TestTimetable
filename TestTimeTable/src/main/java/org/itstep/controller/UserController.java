package org.itstep.controller;

import org.itstep.model.Lesson;
import org.itstep.model.User;
import org.itstep.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/user")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE }, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity<User> save(@RequestParam User user) {
		if (userService.save(user) != null) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity update(@RequestParam User user) {
		if (userService.update(user) != null) {
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

	@GetMapping(path = "/get-one", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	ResponseEntity<User> getOne(@RequestParam String login) {
		User user = userService.get(login);
		if (user != null) {
			return new ResponseEntity(user, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

}
