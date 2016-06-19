package com.niit.shoppingcart2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart2.dao.UserDAO;

@Controller
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/isValidUser")
	public ModelAndView showMessage(@RequestParam(value="name") String name ,
			@RequestParam(value="password") String password )
	{
		System.out.println("In Controller");
		String message;
		if(userDAO.isValidUser(name, password))
		{
			message="Valid Credentials";
			
		}
		else
		{
			message="InValid Credentials";		
		}
		ModelAndView mv=new ModelAndView("Success");
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		System.out.println("In Controller");
		ModelAndView mv=new ModelAndView("Login");
		return mv;
	}
}
