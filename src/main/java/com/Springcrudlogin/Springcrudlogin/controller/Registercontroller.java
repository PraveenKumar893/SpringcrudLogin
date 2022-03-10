package com.Springcrudlogin.Springcrudlogin.controller;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Springcrudlogin.Springcrudlogin.DaoImpl.RegisterDao;
import com.Springcrudlogin.Springcrudlogin.Models.RegisterModel;

@Controller
public class Registercontroller 
{
	@Autowired
	RegisterDao object;
	
	
	@RequestMapping (value =  "/")
	
	public ModelAndView indexfieldd ( HttpServletResponse response)
	{
		return new ModelAndView("index");
		
	}
	
	@RequestMapping (value = "/Register")
	
	public ModelAndView Register ( HttpServletResponse response)
	{
		return new ModelAndView("login");
		
	}
	
	@RequestMapping (value = "/registercontroller" , method = RequestMethod.POST) 
	
	public ModelAndView Registered ( HttpServletRequest request,    HttpServletResponse response)
	{
		String name = request.getParameter("Name");
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");

		System.out.println("Password: "+password);
		
		RegisterModel  model = new RegisterModel(name,username,password);
		
		object.register(model);
		
		
		return new ModelAndView("sucess");
		
	}


	

}
