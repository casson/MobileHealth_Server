package com.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.*;

import com.opensymphony.xwork2.ActionSupport;

public class ModifyAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1984190793551556238L;
	private Float RHR;
	private Float AHR;
	private Integer userId;
	private	Map<String, Object> dataMap = new HashMap<String, Object>();
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	public ApplicationContext aContext = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String hbMod(){
		return SUCCESS;
	}
	public String sleepMod(){
		return SUCCESS;
	}
}
