package com.flash.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flash.dto.OptionXML;
import com.flash.dto.OptionsXML;
import com.flash.dto.QuestionXML;
import com.flash.dto.QuestionsXML;
import com.flash.entity.Login;
import com.flash.entity.QuestionAndAnswer;
import com.flash.entity.QuestionAndOptions;

@Repository("QuestionAndOptionsDAO")
public class QuestionAndOptionsDAO implements IQuestionAndOptionsDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public QuestionsXML getQuestions(String topic){
		ArrayList al=new ArrayList<>();
		QuestionsXML qx=new QuestionsXML();
		QuestionXML qxml;
		OptionsXML opsxml;
		OptionXML opxml;
		Session s=sessionFactory.openSession();
		SQLQuery query = s
				.createSQLQuery(
						"Select * From QuestionAndAnswer where Topic_Id=:topicId");
		query.addEntity(QuestionAndAnswer.class);
		query.setParameter("topicId", topic);
		
		List<QuestionAndAnswer> results = (List<QuestionAndAnswer>)query.list();
		List<QuestionXML> quesList=new ArrayList<QuestionXML>();
		
		for(QuestionAndAnswer a: results)
		{
			qxml=new QuestionXML();
			qxml.setId(a.getqId());
			qxml.setQuestion(a.getQuestion());
			opsxml= new OptionsXML();
			List<OptionXML> optionList=new ArrayList<OptionXML>();
			query = s
					.createSQLQuery("Select * From QuestionAndOptions where Q_Id=:qpId");
			query.addEntity(QuestionAndOptions.class);
			query.setParameter("qpId", a.getqId());
			List<QuestionAndOptions>  result= (List<QuestionAndOptions>) query.list();
			for(QuestionAndOptions qas:result)
			{
				opxml=new OptionXML();
				opxml.setOpId(qas.getOptionId());
				opxml.setOptionValue(qas.getOptionVal());
				optionList.add(opxml);
			}
			opsxml.setOption(optionList);
			qxml.setOptions(opsxml);
			quesList.add(qxml);
						
		}
		qx.setQml(quesList);
		sessionFactory.close();
		
		
		return qx;
		
		
	}
}
