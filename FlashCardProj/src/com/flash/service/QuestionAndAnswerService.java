package com.flash.service;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.flash.dao.IQuestionAndAnswerDAO;
import com.flash.dao.ITopicDAO;
import com.flash.entity.QuestionAndAnswer;
import com.flash.entity.Topic;

@Service("questionAndAnswerService")
public class QuestionAndAnswerService implements IQuestionAndAnswerService {
	@Autowired
	IQuestionAndAnswerDAO questionAndAnswerDAO;

	@Autowired
	ITopicDAO topicDAO;
	
	

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List<QuestionAndAnswer> findQuestionAndAnswerByTopicId(int topicId) {
		
		List<QuestionAndAnswer>  questionAndAnswers=questionAndAnswerDAO.findWordsAndMeaningsByTopic(topicId);

		return questionAndAnswers;
	}

	
	
}
