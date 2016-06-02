package com.sg.docker.poc.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BdayModel {

	private Long id;
	private String name;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date date;

	public BdayModel() {
		super();
	}

	public BdayModel(Long id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
