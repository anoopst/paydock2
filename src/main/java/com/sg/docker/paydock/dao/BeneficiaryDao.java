package com.sg.docker.paydock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.docker.paydock.bean.BeneficiaryBean;

public interface BeneficiaryDao extends JpaRepository<BeneficiaryBean,Long>{

}
