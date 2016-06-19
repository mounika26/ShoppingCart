package com.niit.shoppingcart2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart2.dao.UserDAO;

@Controller
public class CategoryController {
  
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("/addCategory")
	public ModelAndView addCategory(@RequestParam(value="categoryName") String categoryName ,
			@RequestParam(value="categoryDescription") String categoryDescription){
		System.out.println("addCategory");
		String message="Successfully Created";
		ModelAndView mv=new ModelAndView("Success");
		mv.addObject("message",message);
		return mv;
		
		
	}
	
}
