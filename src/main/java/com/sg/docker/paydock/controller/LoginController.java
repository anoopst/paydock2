package com.sg.docker.paydock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sg.docker.paydock.bean.LoginBean;

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
	
	
}
