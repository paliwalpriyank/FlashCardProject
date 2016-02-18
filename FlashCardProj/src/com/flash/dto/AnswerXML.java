package com.flash.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("answer")
@XmlRootElement(name = "answer")
@JsonSerialize(include = Inclusion.NON_NULL)
public class AnswerXML {

	@XStreamAsAttribute
	String answer;

	@XStreamAsAttribute
	String word;

	@XStreamAsAttribute
	String meaning;

	/**
	 * @return the answer
	 */
	@XmlAttribute
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
	@XmlAttribute
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
	@XmlAttribute
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
