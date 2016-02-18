package com.flash.transform;

import java.util.ArrayList;
import java.util.List;

import com.flash.dto.AnswerXML;
import com.flash.dto.SubjectXML;
import com.flash.dto.TopicXML;
import com.flash.entity.QuestionAndAnswer;
import com.flash.entity.Subject;
import com.flash.entity.Topic;

public class EntityToDTOTransformer {

	public List<SubjectXML> convertSubjectEntitiesToSubjectXmls(
			List<Subject> subjects) {
		List<SubjectXML> subjectXmls = new ArrayList<SubjectXML>();
		for (Subject subject : subjects) {
			SubjectXML subjectXML = new SubjectXML();
			subjectXML.setSubject_Id(subject.getSubjectID());
			subjectXML.setSubjectName(subject.getSubject());
			subjectXmls.add(subjectXML);
		}
		return subjectXmls;
	}
	
	
	public List<TopicXML> convertTopicEntitesToTopicXmls(List<Topic> topics){
		List<TopicXML> topicXMLs=new ArrayList<TopicXML>();
		for (Topic topic : topics) {
			TopicXML topicXML=new TopicXML();
			topicXML.setTopicName(topic.getTopicName());
			topicXML.setTopicId(topic.getTopicId());
			topicXMLs.add(topicXML);
		}
		return topicXMLs;
	}
	
	
	public List<AnswerXML> convertQuestionAndAnswerEntityToAnswwerXML(List<QuestionAndAnswer> questionAndAnswers){
		List<AnswerXML> answers=new ArrayList<AnswerXML>();
		
		for (QuestionAndAnswer quesitonAndAnswer : questionAndAnswers) {
			AnswerXML answer=new AnswerXML();
			answer.setWord(quesitonAndAnswer.getWord());
			answer.setMeaning(quesitonAndAnswer.getMeaning());
			answers.add(answer);
			
		}
		return answers;
	}
}