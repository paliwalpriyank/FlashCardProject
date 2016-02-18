package com.flash.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.flash.entity.QuestionAndAnswer;
import com.flash.entity.Topic;

@Repository("QuestionAndAnswerDAO")
public class QuestionAndAnswerDAO  implements IQuestionAndAnswerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	
	public List<QuestionAndAnswer> findWordsAndMeaningsByTopic(int topicId) {
		SQLQuery query = sessionFactory.openSession().createSQLQuery(
				"Select * From QuestionAndAnswer where Topic_Id=:topicId");
		query.addEntity(QuestionAndAnswer.class);
		query.setParameter("topicId", topicId);

		List<QuestionAndAnswer> results = query.list();
		
		return results;

		
	}
	
	

}
