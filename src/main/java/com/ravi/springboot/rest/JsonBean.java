package com.ravi.springboot.rest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonBean {
	private String name;
	private List jsonList;
	private String optional;
	private int dummy;
	private List<SubBean> subBean;
	@JsonProperty("class")
	private String classType;
	
	
	public int getDummy() {
		return dummy;
	}

	public void setDummy(int dummy) {
		this.dummy = dummy;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public List<SubBean> getSubBean() {
		return subBean;
	}

	public void setSubBean(List<SubBean> subBean) {
		this.subBean = subBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getJsonList() {
		return jsonList;
	}

	public void setJsonList(List jsonList) {
		this.jsonList = jsonList;
	}

	public String getOptional() {
		return optional;
	}

	public void setOptional(String optional) {
		this.optional = optional;
	}

}
