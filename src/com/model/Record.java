package com.model;

import java.sql.Timestamp;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private Info info;
	private Float rhr;
	private Float ahr;
	private Timestamp recordtime;
	private String regular;

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** minimal constructor */
	public Record(Info info, Timestamp recordtime) {
		this.info = info;
		this.recordtime=recordtime;
	}

	/** full constructor */
	public Record(Info info, Float rhr, Float ahr, Timestamp recordtime,
			String regular) {
		this.info = info;
		this.rhr = rhr;
		this.ahr = ahr;
		this.recordtime=recordtime;
		this.regular = regular;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Info getInfo() {
		return this.info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Float getRhr() {
		return this.rhr;
	}

	public void setRhr(Float rhr) {
		this.rhr = rhr;
	}

	public Float getAhr() {
		return this.ahr;
	}

	public void setAhr(Float ahr) {
		this.ahr = ahr;
	}


	public Timestamp getRecordtime() {
		return recordtime;
	}

	public void setRecordtime(Timestamp recordtime) {
		this.recordtime = recordtime;
	}

	public String getRegular() {
		return this.regular;
	}

	public void setRegular(String regular) {
		this.regular = regular;
	}

}