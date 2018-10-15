package com.niit.shopfrontend.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.shopbackend.dao.CategoryRepository;
import com.niit.shopbackend.dao.ProductRepository;
import com.niit.shopbackend.dao.UserDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shopbackend.model.Category;
import com.niit.shopbackend.model.Product;
import com.niit.shopbackend.model.UserDetail;

@Controller
public class HomeController {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	private Category category;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	private Product product;
	@Autowired
	UserDetailRepository userDetailRepository;
	@Autowired
	private UserDetail userDetail;
	
	@RequestMapping("/")
	public String homePage(HttpSession httpSession)
	{
		List<Category> allCategories= categoryRepository.getAllCategory();
		httpSession.setAttribute("categoryList",allCategories);
		return "index";
		
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	@RequestMapping("/signIn")
	public String signInPage()
	{
		
		return "SignIn";
	}
	
	@RequestMapping("/signUp")
	public String signUpPage(Model model)
	{
		
		model.addAttribute("user",userDetail);
		return "SignUp";
	}
	
	@RequestMapping("/category")
	public String categoryPage(Model model)
	{  
		List<Category> allCategories= categoryRepository.getAllCategory();
		model.addAttribute("cat",category);
		model.addAttribute("categoryList",allCategories);
		return "Category";
	}
	
	@RequestMapping("/product")
	public String productPage(Model model)
	{  
		List<Product> allProducts= productRepository.getAllProduct();
		model.addAttribute("product",product);
		model.addAttribute("productList",allProducts);
		List<Category> allCategories= categoryRepository.getAllCategory();
		model.addAttribute("categoryList",allCategories);
		return "Product";
	}
	
	@RequestMapping("/adminHome")
	public String adminPage(Model model)
	{
		return "Admin";
	}
	
	@RequestMapping("/aboutUs")
	public String aboutUsPage(Model model)
	{
		return "AboutUs";
	}
	
}