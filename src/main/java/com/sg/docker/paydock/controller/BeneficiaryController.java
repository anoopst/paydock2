package com.sg.docker.paydock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sg.docker.paydock.bean.BeneficiaryBean;
import com.sg.docker.paydock.model.BeneficiaryModel;
import com.sg.docker.paydock.service.IBeneficiaryService;

@Controller
public class BeneficiaryController {

	@Autowired
	IBeneficiaryService beneficiaryService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView addBeneficiary(){
		return new ModelAndView("add","command",new BeneficiaryModel());
	}

	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute BeneficiaryModel model){
		beneficiaryService.add(model);
		return new ModelAndView("confirm");
	}
	
	@RequestMapping("/save")
	public String save(){
		return "beneficiary/message";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView("list");
		List<BeneficiaryBean> lists = beneficiaryService.listAll();		
		mv.addObject("lists", lists);
		return mv;
	}
}
