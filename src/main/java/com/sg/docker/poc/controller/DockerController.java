package com.sg.docker.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sg.docker.poc.service.IBdayService;

@Controller
public class DockerController { 
	
	@Autowired
	IBdayService bdayService;
	
	public IBdayService getBdayService() {
		return bdayService;
	}

	public void setBdayService(IBdayService bdayService) {
		this.bdayService = bdayService;
	}

	@RequestMapping(value = "/addBday",method=RequestMethod.GET)
	public ModelAndView addBday(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		//mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping(value = "/addBday",method=RequestMethod.POST)
	public String addBdayPost (@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return null;
	}
}
