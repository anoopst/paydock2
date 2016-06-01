package com.sg.docker.poc.bean;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="dockerpoc.bday")
@Table(name="dockerpoc.bday")
public class BdayBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private Calendar date;

	public BdayBean(Long id, String name, Calendar dob) {
		super();
		this.id = id;
		this.name = name;
		this.date = dob;
	}

	public BdayBean() {
		super();		
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

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
	

}
