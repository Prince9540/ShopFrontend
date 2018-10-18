package com.niit.shopfrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shopbackend.dao.UserDetailRepository;
import com.niit.shopbackend.model.UserDetail;

@Controller
public class UserController {
	
	
	@Autowired
	UserDetailRepository userDetailRepository;

	@RequestMapping(value="/addUserDetail",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") UserDetail user)
	{
        userDetailRepository.addUserDetail(user);
	
		return "SignIn";
	}
	
	

}
