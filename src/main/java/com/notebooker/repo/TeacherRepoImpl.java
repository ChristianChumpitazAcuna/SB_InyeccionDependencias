package com.notebooker.repo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.notebooker.model.Teacher;

@Repository
@Qualifier("teacherRepoImpl")
public class TeacherRepoImpl  implements TeacherRepo{

	@Override
	public boolean insert(Teacher teacher) {
		System.out.println(teacher.toString());
		return true;
		
	}
	

}
