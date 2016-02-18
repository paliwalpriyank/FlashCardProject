package com.flash.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flash.entity.Subject;

@Repository(value = "subjectDAO")
public class SubjectDAO implements ISubjectDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Subject> retrieveSubjects() {
		SQLQuery query = sessionFactory.openSession().createSQLQuery(
				"Select * From Subject");
		query.addEntity(Subject.class);
		List<Subject> results = query.list();
		sessionFactory.close();
		return results;

	}

	@Override
	public Subject retrieveSubjectBasedOnSubjectName(String subjectName) {
		SQLQuery query = sessionFactory.openSession().createSQLQuery(
				"Select * From Subject where Subject=:subjectName");
		query.addEntity(Subject.class);
		query.setParameter("subjectName", subjectName);
		List results = query.list();
		sessionFactory.close();
		return (Subject) results.get(0);
	}
	
	
	
}
