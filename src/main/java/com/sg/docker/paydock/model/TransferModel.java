package com.sg.docker.paydock.model;

public class TransferModel {

	private Long benId;
	private Double amt;

	public Long getBenId() {
		return benId;
	}

	public void setBenId(Long benId) {
		this.benId = benId;
	}

	public Double getAmt() {
		return amt;
	}

	public void setAmt(Double amt) {
		this.amt = amt;
	}

}
