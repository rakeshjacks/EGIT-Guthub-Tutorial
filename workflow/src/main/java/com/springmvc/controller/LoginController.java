package com.springmvc.controller;

import java.util.Map;






import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.constants.URLMappingConstants;
import com.springmvc.model.User;
@Controller
public class LoginController extends URLMappingConstants {
	
	/*@Autowired
	LoginUserService loginUserService;*/
	
	@RequestMapping(value=LOGINUSER)
	public ModelAndView verifyUser(HttpServletRequest request,
			HttpServletResponse response, HttpSession httpSession,
			User user, BindingResult bindingResult, Map<String, String> model)
	{
		if((user.getEmail() != null && user.getEmail() != "")&&(user.getPassword() != null && user.getPassword() != "") ){
			if(user.getEmail().equals(user.getPassword())){
				ModelAndView modelAndView = new ModelAndView(DASHBOARDDEF);
				model.put("MSG","Login Success");
				return modelAndView;
			}else{
				ModelAndView modelAndView = new ModelAndView(LOGINDEF);
				model.put("MSG","Invalid UserId Or Password..");
				return modelAndView;
			}
		}else{
			ModelAndView modelAndView = new ModelAndView(LOGINDEF);
			model.put("MSG","Invalid UserId Or Password..");
			return modelAndView;
		}
		
		
	}
	@RequestMapping(value=FORGOTPASSWORD)
	public ModelAndView forgorPassword(HttpServletRequest request,
			HttpServletResponse response, HttpSession httpSession,
			User user, BindingResult bindingResult, Map<String, String> model)
	{
		ModelAndView modelAndView = new ModelAndView(FORGOTPASSWORDDEF);
		return modelAndView;
		
	}
	
	
	

}
