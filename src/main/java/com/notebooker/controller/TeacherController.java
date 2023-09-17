package com.notebooker.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notebooker.model.Teacher;
import com.notebooker.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
	//@Autowired //(required = false)
	//@Qualifier("teacherRepoImpl")
	//private TeacherRepo repo;// = new TeacherRepoImpl();
	@Autowired
	private TeacherService service;
	/*
	//@Autowired
	public TeacherController(@Qualifier("newTeacherRepoImpl") TeacherRepo repo) {
		super();
		this.repo = repo;
	}
	*/
	
	@PostMapping
	public void insertTeacher(@RequestBody Teacher teacher) {
		service.insertValidate(teacher);
	}
}
