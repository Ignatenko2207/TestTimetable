package org.itstep.controller;

import org.itstep.model.Teacher;
import org.itstep.service.TeacherService;
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
@RequestMapping(path="/teacher")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@PostMapping( consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	ResponseEntity<Teacher> save(@RequestParam Teacher teacher) {
		if(teacherService.save(teacher) != null) {
			return new ResponseEntity<Teacher>(teacher, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@PutMapping( consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE} )
	ResponseEntity update(@RequestParam Teacher teacher) {
		if(teacherService.update(teacher) != null) {
			return new ResponseEntity(HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping( path = "/get-one", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE} )
	ResponseEntity<Teacher> getOne(@RequestParam String login) {
		Teacher teacher = teacherService.get(login);
		if( teacher != null) {
			return new ResponseEntity(teacher, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}

}
