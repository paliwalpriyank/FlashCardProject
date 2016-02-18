package com.flash.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.flash.entity.Topic;

@Repository(value = "topicDAO")
public class TopicDAO implements ITopicDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Topic> retrieveTopics(int subjectId) {
		SQLQuery query = sessionFactory.openSession().createSQLQuery(
				"Select * From Topic where SubjectID=:subjectId");
		query.addEntity(Topic.class);
		query.setParameter("subjectId", subjectId);

		List<Topic> results = query.list();
		sessionFactory.close();
		return results;
	}

	@Override
	public Topic retrieveTopic(String topicName) {
		SQLQuery query = sessionFactory.openSession().createSQLQuery(
				"Select * From Topic where Topic_Name=:topicName");
		query.addEntity(Topic.class);
		query.setParameter("topicName", topicName);

		List results = query.list();
		sessionFactory.close();
		return (Topic) results.get(0);
	}

}
