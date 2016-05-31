package com.sg.docker.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sg.docker.poc.bean.BdayBean;
import com.sg.docker.poc.dao.BdayDao;

public class BdayService implements IBdayService {
	
	@Autowired
	private BdayDao dao;

	@Override
	public void add(BdayBean bdayBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BdayBean> listAll() {		
		return dao.findAll();
	}

}
