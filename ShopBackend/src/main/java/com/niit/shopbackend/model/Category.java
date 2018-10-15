package com.niit.shopbackend.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Category implements Serializable{
	@Id  // primary key
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int categoryId;
	private String categoryName;
	private String categoryDescription;
	
	@OneToMany(mappedBy="category", fetch=FetchType.EAGER)
	Set<Product> allProducts;
	
	
	public Set<Product> getAllProducts() {
		return allProducts;
	}
	public void setAllProducts(Set<Product> allProducts) {
		this.allProducts = allProducts;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
