package com.sg.docker.paydock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.docker.paydock.bean.TransferBean;

public interface TransferServiceDao extends JpaRepository<TransferBean, Long> {

}
