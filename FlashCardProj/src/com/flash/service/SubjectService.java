package com.flash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.flash.dao.ISubjectDAO;
import com.flash.entity.Subject;


@Service(value="subjectService")
public class SubjectService implements ISubjectService {

	@Autowired
	ISubjectDAO subjectDAO;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public List<Subject> retrieveSubjects() {
		List<Subject> subjects = subjectDAO.retrieveSubjects();
		return subjects;
	}

}
