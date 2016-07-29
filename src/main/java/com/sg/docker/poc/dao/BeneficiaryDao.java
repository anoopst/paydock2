package com.sg.docker.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.docker.poc.bean.BeneficiaryBean;

public interface BeneficiaryDao extends JpaRepository<BeneficiaryBean,Long>{

}
