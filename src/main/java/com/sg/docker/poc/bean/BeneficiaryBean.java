package com.sg.docker.poc.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "dockerpoc.beneficiary")
@Table(name = "dockerpoc.beneficiary")
public class BeneficiaryBean {

	@Id
	private Long accnum;
	private String name;

	public BeneficiaryBean(Long accnum, String name) {
		super();
		this.accnum = accnum;
		this.name = name;
	}

	public BeneficiaryBean() {
		super();
	}

	public Long getAccnum() {
		return accnum;
	}

	public void setAccnum(Long accnum) {
		this.accnum = accnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
