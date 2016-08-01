package com.sg.docker.paydock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sg.docker.paydock.bean.BeneficiaryBean;
import com.sg.docker.paydock.dao.BeneficiaryDao;
import com.sg.docker.paydock.model.BeneficiaryModel;

public class BeneficiaryService implements IBeneficiaryService {

	@Autowired
	private BeneficiaryDao dao;

	@Override
	public void add(BeneficiaryModel model) {
		BeneficiaryBean benef = new BeneficiaryBean();
		benef.setAccnum(model.getAccnum());
		benef.setName(model.getName());
		dao.saveAndFlush(benef);
	}

	@Override
	public List<BeneficiaryBean> listAll() {
		return dao.findAll();
	}

}