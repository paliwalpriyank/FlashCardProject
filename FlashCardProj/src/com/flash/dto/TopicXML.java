package com.flash.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("topic")
@XmlRootElement(name = "topic")
@JsonSerialize(include = Inclusion.NON_NULL)
public class TopicXML {
	@XStreamAsAttribute
	private int topicId;
	@XStreamAsAttribute
	private String topicName;

	/**
	 * @return the topic_Id
	 */
	@XmlAttribute
	public int getTopicId() {
		return topicId;
	}

	/**
	 * @param topic_Id
	 *            the topic_Id to set
	 */
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	/**
	 * @return the topic_Name
	 */
	@XmlAttribute
	public String getTopicName() {
		return topicName;
	}

	/**
	 * @param topic_Name
	 *            the topic_Name to set
	 */
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

}
