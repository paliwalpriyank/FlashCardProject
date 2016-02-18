package com.flash.service;

import java.util.List;

import com.flash.entity.Topic;

public interface ITopicService {

	public List<Topic> retrieveTopics(String subjectName);
	
	public Topic retrieveTopic(String topicName);

}
