package com.nielsen.domain;


public class ProductListByCustomerRequestBody {


    private String shopperId;
    private String category;
    private String brand;
    private int limit;
	public ProductListByCustomerRequestBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductListByCustomerRequestBody(String shopperId, String category, String brand, int limit) {
		super();
		this.shopperId = shopperId;
		this.category = category;
		this.brand = brand;
		this.limit = limit;
	}
	public String getShopperId() {
		return shopperId;
	}
	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
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
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}


	
	
    
}
