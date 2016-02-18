package com.flash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questionandoptions")
public class QuestionAndOptions {

	@Id
	@Column(name = "QOp_Id", nullable = false)
	private int qopId;
	
	@Column(name = "Option_Id", nullable = false)
	private int optionId;
	
	@Column(name = "Q_Id", nullable = false)
	private int qId;
	
	@Column(name = "Option_Val", nullable = false)
	private String optionVal;

	public int getQopId() {
		return qopId;
	}

	public void setQopId(int qopId) {
		this.qopId = qopId;
	}

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getOptionVal() {
		return optionVal;
	}

	public void setOptionVal(String optionVal) {
		this.optionVal = optionVal;
	}
	
	
}
