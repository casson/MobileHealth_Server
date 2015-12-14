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

public class AddAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userId;
	private String password;
	private String userName;
	private String phoneNum;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	// @Autowired
	// private InfoDAO infoDao;
	private Map<String, Object> dataMap = new HashMap<String, Object>();

	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;

	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}

	public String addUser() {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		InfoDAO infoDao = InfoDAO.getFromApplicationContext(aContext);
		try {
			Info info = new Info();
			info.setUserId(userId);
			info.setPassword(password);
			info.setPhoneNum(phoneNum);
			info.setUserName(userName);
			infoDao.save(info);
		} catch (Exception e) {
			dataMap.clear();
			dataMap.put("register", "false");
			return ERROR;
		}
		dataMap.clear();
		dataMap.put("register", "true");
		return SUCCESS;
	}
}
