package com.niit.shopfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shopbackend.dao.CategoryRepository;
import com.niit.shopbackend.dao.UserDetailRepository;
import com.niit.shopbackend.model.Category;
import com.niit.shopbackend.model.UserDetail;

@Controller
public class UserController {
	
	
	@Autowired
	UserDetailRepository userDetailRepository;

	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") UserDetail user)
	{
	/*	if(0==0)
		{
			userDetailRepository.addUserDetail(user);
		}
		else
		{
			//userDetailRepository.updateCategory(category);
		}
		*/
		return "redirect:/category";
	}
	
	

}
