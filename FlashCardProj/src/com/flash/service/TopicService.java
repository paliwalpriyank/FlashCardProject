package com.flash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.flash.dao.ISubjectDAO;
import com.flash.dao.ITopicDAO;
import com.flash.entity.Subject;
import com.flash.entity.Topic;

@Service(value = "topicService")
public class TopicService implements ITopicService {

	@Autowired
	ISubjectDAO subjectDAO;

	@Autowired
	ITopicDAO topicDAO;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public List<Topic> retrieveTopics(String subjectName) {
		Subject subject = subjectDAO
				.retrieveSubjectBasedOnSubjectName(subjectName);
		List<Topic> topics = topicDAO.retrieveTopics(subject.getSubjectID());
		return topics;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Topic retrieveTopic(String topicName) {
		Topic topic = topicDAO.retrieveTopic(topicName);
		return topic;
	}

}
