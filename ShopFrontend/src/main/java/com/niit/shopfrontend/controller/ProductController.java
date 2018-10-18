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
import com.niit.shopbackend.dao.ProductRepository;
import com.niit.shopbackend.model.Category;
import com.niit.shopbackend.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;


	@RequestMapping(value="/adminAddProduct",method=RequestMethod.POST)
	public String productAdd(@ModelAttribute("cat") Product product)
	{
		if(product.getProductId()==0)
		{
		productRepository.addProduct(product);
		}
		else
		{
			productRepository.updateProduct(product);
		}
		
		return "redirect:/adminProduct";
	}
	
	
	@RequestMapping("/adminDeleteProduct/{id}")
	
		public String productDelete(@PathVariable("id") int productId)
		{
			productRepository.deleteProduct(productId);
			return "redirect:/adminProduct";
	}
	
	
	@RequestMapping("/adminEditProduct/{id}")
	
	public String productUpdate(@PathVariable("id") int productId,Model model)
	{
		Product productData=productRepository.getProductById(productId);
		model.addAttribute("product",productData);
		List<Product> allProduct= productRepository.getAllProduct();
		model.addAttribute("productList",allProduct);
		List<Category> allCategories= categoryRepository.getAllCategory();

		model.addAttribute("categoryList",allCategories);

		return "Product";
}
}









