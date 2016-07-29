package com.sg.docker.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sg.docker.poc.bean.BeneficiaryBean;
import com.sg.docker.poc.dao.BeneficiaryDao;
import com.sg.docker.poc.model.BeneficiaryModel;

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