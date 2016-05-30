package com.sg.docker.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.docker.poc.bean.BdayBean;

@Service
@Transactional
public interface IBdayService {
	
	public void add(BdayBean bdayBean);
	
	public List<BdayBean> listAll();

}
