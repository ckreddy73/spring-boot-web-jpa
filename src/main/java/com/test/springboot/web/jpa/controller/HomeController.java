package com.test.springboot.web.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.springboot.web.jpa.entity.UserRecord;
import com.test.springboot.web.jpa.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST) 
	public ModelAndView save(@ModelAttribute UserRecord user) {
		userService.addUser(user);
		return getView(user.getEmp_id());
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET) 
	public ModelAndView getUser(@PathVariable int id) {		
		return getView(id);
	}
	
	@RequestMapping(value="/getAllUsers", method=RequestMethod.GET) 
	public ModelAndView getAllUsers() {
		return getView(null);
	}	

	@RequestMapping(value="/deleteuser/{id}", method=RequestMethod.GET) 
	public ModelAndView delete(@PathVariable int id) {		
		ModelAndView view =  getView(id);
		userService.delete(id);
		return view;
	}	
	
	
	private ModelAndView getView(Integer id) {
		if(id == null) {
			return new ModelAndView("all-user-data", "users", userService.getAllUsers()); 
		} else {
			return new ModelAndView("user-data", "user", userService.getUser(id)); 
		}		 
	}	
}
