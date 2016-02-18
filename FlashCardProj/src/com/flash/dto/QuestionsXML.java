package com.flash.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("questions")
@XmlRootElement(name = "questions")
@JsonSerialize(include = Inclusion.NON_NULL)
public class QuestionsXML {
	List<QuestionXML> questions=new ArrayList<QuestionXML>();
	@XmlElementWrapper
	@XmlElement(name = "Questions")	
public List<QuestionXML> getQml() {
		return questions;
	}

	public void setQml(List<QuestionXML> qml) {
		this.questions = qml;
	}


}
