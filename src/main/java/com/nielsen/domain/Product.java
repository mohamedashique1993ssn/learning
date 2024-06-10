package com.nielsen.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
    private String product_id;

    private String name;
    private String category;
    private String brand;
    
    
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(String product_id, String name, String category, String brand) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.category = category;
		this.brand = brand;
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	
	
    
}
