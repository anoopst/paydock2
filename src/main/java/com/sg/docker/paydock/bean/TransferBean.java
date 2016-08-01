package com.sg.docker.paydock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "paydock.transfer")
@Table(name = "paydock.transfer")
public class TransferBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long accnum;
	private Double amt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccnum() {
		return accnum;
	}

	public void setAccnum(Long accnum) {
		this.accnum = accnum;
	}

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

}
