package com.sg.docker.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.docker.poc.bean.BeneficiaryBean;
import com.sg.docker.poc.model.BeneficiaryModel;

@Service
@Transactional
public interface IBeneficiaryService {

	public void add(BeneficiaryModel benefBean);

	public List<BeneficiaryBean> listAll();

}
