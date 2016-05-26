package com.sg.docker.poc.dao;

import org.springframework.data.repository.CrudRepository;
import com.sg.docker.poc.bean.BdayBean;

public interface BdayDao extends CrudRepository<BdayBean,Long>{

}
