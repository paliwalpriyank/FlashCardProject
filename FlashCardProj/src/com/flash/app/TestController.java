package com.flash.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flash.dto.LoginResponseXML;
import com.flash.dto.QuestionsXML;
import com.flash.dto.RequestXML;
import com.flash.service.IQuestionAndOptionsService;

@Controller
@RequestMapping(value = "test")
public class TestController {
	@Autowired
	IQuestionAndOptionsService iQOserv;
	@ResponseBody
	@RequestMapping(value = "/getQuestions", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" })
	public QuestionsXML getQuizQuestions(@RequestBody RequestXML loginRequest) {
		QuestionsXML s=iQOserv.getQuestions((new Integer(loginRequest.getTopic().getTopicId())).toString());
		
		return s;
	}
	
}
