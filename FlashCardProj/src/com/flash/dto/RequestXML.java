package com.flash.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("request")
@XmlRootElement(name = "request")
@JsonSerialize(include = Inclusion.NON_NULL)
public class RequestXML {
	LoginRequestXML login;
	QuestionXML question;
	SubjectXML subject;
	TopicXML topic;

	List<QuestionXML> questions = new ArrayList<QuestionXML>();

	/**
	 * @return the question
	 */
	@XmlElement
	public QuestionXML getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(QuestionXML question) {
		this.question = question;
	}

	/**
	 * @return the login
	 */
	@XmlElement
	public LoginRequestXML getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(LoginRequestXML login) {
		this.login = login;
	}

	/**
	 * @return the subject
	 */
	@XmlElement
	public SubjectXML getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(SubjectXML subject) {
		this.subject = subject;
	}

	/**
	 * @return the topic
	 */
	@XmlElement
	public TopicXML getTopic() {
		return topic;
	}

	/**
	 * @param topic
	 *            the topic to set
	 */
	public void setTopic(TopicXML topic) {
		this.topic = topic;
	}

	/**
	 * @return the questions
	 */
	@XmlElementWrapper
	@XmlElement(name = "questions")
	public List<QuestionXML> getQuestions() {
		return questions;
	}

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(List<QuestionXML> questions) {
		this.questions = questions;
	}

}
