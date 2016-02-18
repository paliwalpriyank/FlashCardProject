package com.flash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questionandanswer")
public class QuestionAndAnswer {

	@Id
	@Column(name = "Q_Id", nullable = false)
	private int qId;
	@Column(name = "Topic_Id", nullable = false)
	private int Topic_Id;
	@Column(name = "Question", nullable = false)
	private String question;
	@Column(name = "Answer", nullable = false)
	private String answer;
	@Column(name = "Word", nullable = false)
	private String word;
	@Column(name = "Meaning")
	private String meaning;

	/**
	 * @return the qId
	 */
	public int getqId() {
		return qId;
	}

	/**
	 * @param qId
	 *            the qId to set
	 */
	public void setqId(int qId) {
		this.qId = qId;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer
	 *            the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word
	 *            the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the meaning
	 */
	public String getMeaning() {
		return meaning;
	}

	/**
	 * @param meaning
	 *            the meaning to set
	 */
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

}
