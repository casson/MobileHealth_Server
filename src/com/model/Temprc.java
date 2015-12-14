package com.model;

import java.sql.Timestamp;

/**
 * Temprc entity. @author MyEclipse Persistence Tools
 */

public class Temprc implements java.io.Serializable {

	// Fields

	private Integer temprcId;
	private Info info;
	private Timestamp temprctime;
	private Float bpm;
	private String status;

	// Constructors

	/** default constructor */
	public Temprc() {
	}

	/** full constructor */
	public Temprc(Info info, Timestamp temprctime, Float bpm) {
		this.info = info;
		this.temprctime=temprctime;
		this.bpm = bpm;
	}

	public Info getInfo() {
		return this.info;
	}

	public void setInfo(Info info) {
		this.info = info;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getBpm() {
		return this.bpm;
	}

	public void setBpm(Float bpm) {
		this.bpm = bpm;
	}

}