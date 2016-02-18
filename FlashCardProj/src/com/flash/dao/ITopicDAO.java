package com.flash.dao;

import java.util.List;

import com.flash.entity.*;

public interface ITopicDAO {

	public List<Topic> retrieveTopics(int subjectId);

	public Topic retrieveTopic(String topicName);

}
