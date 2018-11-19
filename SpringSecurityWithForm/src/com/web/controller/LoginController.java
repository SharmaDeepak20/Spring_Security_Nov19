package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="home")
	public String getHome()
	{
		return "home";
	}//end getHome
	
	@RequestMapping(value="login")
	public ModelAndView getLoginForm(@RequestParam(required=false) String authfailed, String logout)
	{
		String message="";
		
		if(authfailed!=null)
		{
			message="Invalid username or Password";
		}
		else if(logout!=null)
		{
			message="Logout Successfully";
		}
		
		return new ModelAndView("login","message",message);
	}//end getLogingForm
	
	@RequestMapping(value="profile")
	public String getProfile()
	{
		return "profile";
	}//end getProfile
}
