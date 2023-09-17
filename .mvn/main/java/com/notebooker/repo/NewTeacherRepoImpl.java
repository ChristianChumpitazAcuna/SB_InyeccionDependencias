package com.notebooker.repo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.notebooker.model.Teacher;
@Repository
@Qualifier("newTeacherRepoImpl")
public class NewTeacherRepoImpl implements TeacherRepo{
	
	@Override
	public boolean insert(Teacher teacher) {
		System.out.println("New Teacher: " + teacher.toString());
		return true;
		
	}

}
