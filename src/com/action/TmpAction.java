package com.action;



import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import com.model.*;
public class TmpAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer temprcId;
	private Integer userId;
	private Timestamp temprctime;
	private Float bpm;
	private String status;
	private Map<String, Object> dataMap = new HashMap<String, Object>();
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	public Float getBpm() {
		return bpm;
	}

	public void setBpm(Float bpm) {
		this.bpm = bpm;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTemprcId() {
		return temprcId;
	}

	public void setTemprcId(Integer temprcId) {
		this.temprcId = temprcId;
	}

	public Timestamp getTemprctime() {
		return temprctime;
	}

	public void setTemprctime(Timestamp temprctime) {
		this.temprctime = temprctime;
	}

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
		this.response = response;

	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}
	public String addTemprc(){
		ApplicationContext aContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TemprcDAO tmprcDao = TemprcDAO.getFromApplicationContext(aContext);
		Temprc tmp = new Temprc();
		Info info = new Info();
		try {
			info.setUserId(userId);
			tmp.setBpm(bpm);
			tmp.setTemprctime(temprctime);
			tmp.setInfo(info);
			tmp.setStatus(status);
			tmp.setTemprcId(temprcId);
			tmprcDao.save(tmp);
		} catch (Exception e) {
			dataMap.clear();
			dataMap.put("insert", "false");
			return ERROR;
		}
		dataMap.clear();
		dataMap.put("insert", "true");
		return SUCCESS;
	}
}
