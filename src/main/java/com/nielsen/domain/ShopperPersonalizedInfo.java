package com.nielsen.domain;

import java.util.List;

public class ShopperPersonalizedInfo {


    private String shopperId;
    private List<Shelf> shelf;
    
	public ShopperPersonalizedInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopperPersonalizedInfo(String shopperId, List<Shelf> shelf) {
		super();
		this.shopperId = shopperId;
		this.shelf = shelf;
	}
	public String getShopperId() {
		return shopperId;
	}
	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}
	public List<Shelf> getShelf() {
		return shelf;
	}
	public void setShelf(List<Shelf> shelf) {
		this.shelf = shelf;
	}
	
    
}
