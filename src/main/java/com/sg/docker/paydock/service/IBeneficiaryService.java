package com.sg.docker.paydock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.docker.paydock.bean.BeneficiaryBean;
import com.sg.docker.paydock.model.BeneficiaryModel;

@Service
@Transactional
public interface IBeneficiaryService {

	public void add(BeneficiaryModel benefBean);

	public List<BeneficiaryBean> listAll();

}
