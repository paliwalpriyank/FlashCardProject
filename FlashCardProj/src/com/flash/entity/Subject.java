package com.flash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "subject")
public class Subject {
	
	@Id
	@Column(name = "SubjectID", nullable = false)
	private int subjectID;
	@Column(name = "Subject", nullable = false)
	private String subject;
	/**
	 * @return the subjectID
	 */
	public int getSubjectID() {
		return subjectID;
	}
	/**
	 * @param subjectID the subjectID to set
	 */
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	

}


