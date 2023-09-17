package com.notebooker.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.notebooker.repo.TeacherRepo;
import com.notebooker.model.Teacher;

@Service
public class TeacherServiceImpl  implements TeacherService{
	@Autowired
	@Qualifier("teacherRepoImpl")
	private TeacherRepo repo;
	
	@Override
	public boolean insertValidate(Teacher teacher) {
		int age = Period.between(teacher.getBirthday(), LocalDate.now()).getYears();
		return 	age >= 18 ? repo.insert(teacher) : false;
	}

}
