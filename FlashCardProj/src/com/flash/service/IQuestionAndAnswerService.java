package com.flash.service;

import java.util.List;

import com.flash.entity.QuestionAndAnswer;

public interface IQuestionAndAnswerService {
	public List<QuestionAndAnswer> findQuestionAndAnswerByTopicId(int topicId);


}
