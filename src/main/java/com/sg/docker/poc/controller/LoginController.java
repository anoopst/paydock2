package com.sg.docker.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sg.docker.poc.bean.LoginBean;
import com.sg.docker.poc.model.BeneficiaryModel;
import com.sg.docker.poc.service.IBeneficiaryService;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("login", new LoginBean());
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") LoginBean login) {
		/*if (login != null) {
			if ("anoop".equals(login.getPassword().equals("anoop") && login.getName().equals("anoop"))
				return "home";
		}*/
		return "home";
	}
	
	@Autowired
	IBeneficiaryService beneficiaryService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView addBeneficiary(){
		System.out.println("benef ADD");
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
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView("list");
		mv.addObject("lists", beneficiaryService.listAll());
		return mv;
	}
}
