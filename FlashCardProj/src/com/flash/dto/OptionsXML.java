package com.flash.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("options")
@XmlRootElement(name = "options")
@JsonSerialize(include = Inclusion.NON_NULL)
public class OptionsXML {
	List<OptionXML> option = new ArrayList<OptionXML>();

	@XmlElement
	public List<OptionXML> getOption() {
		return option;
	}

	public void setOption(List<OptionXML> option) {
		this.option = option;
	}
	
	
}
