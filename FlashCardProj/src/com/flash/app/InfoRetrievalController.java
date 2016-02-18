package com.flash.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flash.dto.AnswerXML;
import com.flash.dto.RequestXML;
import com.flash.dto.ResponseXML;
import com.flash.dto.SubjectXML;
import com.flash.dto.TopicXML;
import com.flash.entity.QuestionAndAnswer;
import com.flash.entity.Subject;
import com.flash.entity.Topic;
import com.flash.service.IQuestionAndAnswerService;
import com.flash.service.ISubjectService;
import com.flash.service.ITopicService;
import com.flash.transform.EntityToDTOTransformer;

@Controller
@RequestMapping(value = "/api")
public class InfoRetrievalController {

	@Autowired
	IQuestionAndAnswerService questionAndAnswerService;

	EntityToDTOTransformer entityTransformer = new EntityToDTOTransformer();

	@Autowired
	ISubjectService subjectService;

	@Autowired
	ITopicService topicService;

	@ResponseBody
	@RequestMapping(value = "/wordsAndMeanings", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" })
	public ResponseXML getQuestionAndAnswers(@RequestBody RequestXML requestXML) {
		ResponseXML responseXML = new ResponseXML();
		TopicXML topic = requestXML.getTopic();

		List<QuestionAndAnswer> questionsAndAnswers = questionAndAnswerService
				.findQuestionAndAnswerByTopicId(topic.getTopicId());

		List<AnswerXML> answers = entityTransformer
				.convertQuestionAndAnswerEntityToAnswwerXML(questionsAndAnswers);
		responseXML.setAnswers(answers);
		return responseXML;
	}

	@ResponseBody
	@RequestMapping(value = "/subjects", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" })
	public ResponseXML getSubjects(@RequestBody RequestXML requestXML) {
		ResponseXML responseXML = new ResponseXML();
		List<Subject> subjects = subjectService.retrieveSubjects();
		List<SubjectXML> subjectXMLs = entityTransformer
				.convertSubjectEntitiesToSubjectXmls(subjects);
		responseXML.setSubjects(subjectXMLs);
		return responseXML;
	}

	@ResponseBody
	@RequestMapping(value = "/topics", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" })
	public ResponseXML getTopics(@RequestBody RequestXML requestXML) {
		ResponseXML responseXML = new ResponseXML();

		SubjectXML subject = requestXML.getSubject();
		List<Topic> topics = topicService.retrieveTopics(subject
				.getSubjectName());
		List<TopicXML> topicXMLs = entityTransformer
				.convertTopicEntitesToTopicXmls(topics);
		responseXML.setTopics(topicXMLs);
		return responseXML;
	}

}
