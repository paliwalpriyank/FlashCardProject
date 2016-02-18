package com.flash.dao;

import java.util.List;

import com.flash.entity.QuestionAndAnswer;

public interface IQuestionAndAnswerDAO {

	public List<QuestionAndAnswer> findWordsAndMeaningsByTopic(int topicId);

}
