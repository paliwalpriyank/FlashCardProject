package com.flash.dao;

import java.util.List;

import com.flash.entity.Subject;

public interface ISubjectDAO {
	
	public List<Subject> retrieveSubjects();
	
	public Subject retrieveSubjectBasedOnSubjectName(String subjectName);
}
