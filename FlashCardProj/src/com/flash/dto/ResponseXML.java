package com.flash.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("response")
@XmlRootElement(name = "response")
@JsonSerialize(include = Inclusion.NON_NULL)
public class ResponseXML {

	AnswerXML answer;

	List<SubjectXML> subjects = new ArrayList<SubjectXML>();
	List<AnswerXML> answers = new ArrayList<AnswerXML>();
	List<TopicXML> topics = new ArrayList<TopicXML>();

	/**
	 * @return the answer
	 */
	@XmlElement
	public AnswerXML getAnswer() {
		return answer;
	}

	/**
	 * @param answer
	 *            the answer to set
	 */
	public void setAnswer(AnswerXML answer) {
		this.answer = answer;
	}

	/**
	 * @return the subjects
	 */
	@XmlElementWrapper
	@XmlElement(name = "subjects")
	public List<SubjectXML> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(List<SubjectXML> subjects) {
		this.subjects = subjects;
	}

	/**
	 * @return the answers
	 */
	@XmlElementWrapper
	@XmlElement(name = "answers")
	public List<AnswerXML> getAnswers() {
		return answers;
	}

	/**
	 * @param answers
	 *            the answers to set
	 */
	public void setAnswers(List<AnswerXML> answers) {
		this.answers = answers;
	}

	/**
	 * @return the topics
	 */
	@XmlElementWrapper
	@XmlElement(name = "topics")
	public List<TopicXML> getTopics() {
		return topics;
	}

	/**
	 * @param topics
	 *            the topics to set
	 */
	public void setTopics(List<TopicXML> topics) {
		this.topics = topics;
	}

}
