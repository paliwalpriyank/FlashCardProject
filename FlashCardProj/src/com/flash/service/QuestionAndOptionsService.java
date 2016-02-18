package com.flash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.flash.dao.QuestionAndOptionsDAO;
import com.flash.dto.QuestionsXML;

@Service("QuestionAndOptionsService")
public class QuestionAndOptionsService implements IQuestionAndOptionsService {

	@Autowired
	QuestionAndOptionsDAO qad;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public QuestionsXML getQuestions(String topic)
	{
		return qad.getQuestions(topic);
	}
}
