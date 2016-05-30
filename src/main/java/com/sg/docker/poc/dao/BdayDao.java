package com.sg.docker.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.docker.poc.bean.BdayBean;

public interface BdayDao extends JpaRepository<BdayBean,Long>{

}
