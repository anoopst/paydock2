package com.sg.docker.paydock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sg.docker.paydock.model.BeneficiaryModel;
import com.sg.docker.paydock.service.IBeneficiaryService;

@Controller
public class FundTransferController {
	
	@Autowired
	IBeneficiaryService transferService;
	
	@RequestMapping(value="/transfer",method=RequestMethod.GET)
	public ModelAndView getToTransferPAge(){
		return new ModelAndView("transfer","command",new BeneficiaryModel());
	}

}
