package com.flash.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("subject")
@XmlRootElement(name = "subject")
@JsonSerialize(include = Inclusion.NON_NULL)
public class SubjectXML {
	@XStreamAsAttribute
	int subject_Id;
	@XStreamAsAttribute
	String subjectName;

	/**
	 * @return the subject_Id
	 */
	@XmlAttribute
	public int getSubject_Id() {
		return subject_Id;
	}

	/**
	 * @param subject_Id
	 *            the subject_Id to set
	 */
	public void setSubject_Id(int subject_Id) {
		this.subject_Id = subject_Id;
	}

	/**
	 * @return the subjectName
	 */
	@XmlAttribute
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * @param subjectName
	 *            the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
