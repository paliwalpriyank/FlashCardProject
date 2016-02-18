package com.flash.buildinput;

import com.flash.dto.LoginRequestXML;
import com.flash.dto.LoginResponseXML;
import com.flash.dto.QuestionXML;
import com.flash.dto.RequestXML;
import com.flash.dto.SubjectXML;
import com.flash.dto.TopicXML;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class BuildInput {

	public static void main(String[] args) {
		/*
		 * RequestXML request = new RequestXML(); QuestionXML question = new
		 * QuestionXML(); question.setQuestion("What is the word?");
		 * request.setQuestion(question);
		 * 
		 * //Gson gson =new Gson();
		 * 
		 * //String inputString=gson.toJson(request);
		 * 
		 * 
		 * XStream xstream = new XStream(new DomDriver());
		 * xstream.processAnnotations(RequestXML.class);
		 * xstream.processAnnotations(QuestionXML.class);
		 * 
		 * String inputString = xstream.toXML(request);
		 * System.out.println(inputString);
		 */

		/**
		 * RequestXML request = new RequestXML(); LoginRequestXML login=new
		 * LoginRequestXML(); login.setUserName("Venkat");
		 * login.setPassword("venkat123"); request.setLogin(login);
		 * 
		 * Gson gson =new Gson();
		 * 
		 * String inputString=gson.toJson(request);
		 * System.out.println(inputString); XStream xstream = new XStream(new
		 * DomDriver()); xstream.processAnnotations(RequestXML.class);
		 * xstream.processAnnotations(LoginRequestXML.class);
		 * 
		 * 
		 * String inputString = xstream.toXML(request);
		 * System.out.println(inputString);
		 **/

		/**
		 * RequestXML request = new RequestXML(); SubjectXML subject=new
		 * SubjectXML(); subject.setSubjectName("Physics");
		 * request.setSubject(subject); XStream xstream=new XStream(new
		 * DomDriver()); xstream.processAnnotations(RequestXML.class);
		 * xstream.processAnnotations(SubjectXML.class); String inputString =
		 * xstream.toXML(request); System.out.println(inputString);
		 */

		/**
		 * RequestXML request = new RequestXML(); TopicXML topic=new TopicXML();
		 * topic.setTopicId(1); topic.setTopicName("Dynamics");
		 * request.setTopic(topic); XStream xstream=new XStream(new
		 * DomDriver()); xstream.processAnnotations(RequestXML.class);
		 * xstream.processAnnotations(TopicXML.class); String inputString =
		 * xstream.toXML(request); System.out.println(inputString);
		 **/

		RequestXML request = new RequestXML();
		TopicXML topic = new TopicXML();
		topic.setTopicId(1);
		topic.setTopicName("Dynamics");
		request.setTopic(topic);
		Gson gson = new Gson();

		String inputString = gson.toJson(request);
		System.out.println(inputString);
	}

}
