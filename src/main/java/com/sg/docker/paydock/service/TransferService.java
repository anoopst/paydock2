package com.sg.docker.paydock.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sg.docker.paydock.bean.TransferBean;
import com.sg.docker.paydock.dao.TransferServiceDao;
import com.sg.docker.paydock.model.TransferModel;

public class TransferService implements IFundTransferService{
	
	@Autowired
	private TransferServiceDao dao;

	@Override
	public void save(TransferModel model) {		
		TransferBean bean = new TransferBean();
		bean.setAccnum(model.getBenId());
		bean.setAmt(model.getAmt());
		dao.save(bean);
	}
	

}
