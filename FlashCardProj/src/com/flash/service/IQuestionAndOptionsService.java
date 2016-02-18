package com.flash.service;

import java.util.List;

import com.flash.dto.QuestionsXML;

public interface IQuestionAndOptionsService {
	public QuestionsXML getQuestions(String topic);
}
