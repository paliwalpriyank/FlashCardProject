package com.flash.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("question")
@XmlRootElement(name = "question")
@JsonSerialize(include = Inclusion.NON_NULL)
public class QuestionXML {
	@XStreamAsAttribute
	int id;
	@XStreamAsAttribute
	String question;
	OptionsXML options;
	

	/**
	 * @return the question
	 */
	@XmlAttribute
	public String getQuestion() {
		return question;
	}
	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@XmlAttribute
	public OptionsXML getOptions() {
		return options;
	}

	public void setOptions(OptionsXML options) {
		this.options = options;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	

}
