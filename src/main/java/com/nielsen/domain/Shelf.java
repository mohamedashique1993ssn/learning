package com.nielsen.domain;


public class Shelf {
	
    private String productId;
    private double relevancyScore;
    
    
	public Shelf() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Shelf(String productId, double relevancyScore) {
		super();
		this.productId = productId;
		this.relevancyScore = relevancyScore;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public double getRelevancyScore() {
		return relevancyScore;
	}


	public void setRelevancyScore(double relevancyScore) {
		this.relevancyScore = relevancyScore;
	}


	

	
    
}
