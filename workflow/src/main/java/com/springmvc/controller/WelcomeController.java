package com.springmvc.controller;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.constants.URLMappingConstants;
@Controller
public class WelcomeController extends URLMappingConstants {
	@RequestMapping(value=LOGIN,method=RequestMethod.GET)
	public ModelAndView welcome(Map model){
		ModelAndView modelAndView = new ModelAndView(LOGINDEF);
		return modelAndView;
		
	}

}
