package com.sg.docker.paydock.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.docker.paydock.model.TransferModel;

@Service
@Transactional
public interface IFundTransferService {

	public void save(TransferModel model);
}
