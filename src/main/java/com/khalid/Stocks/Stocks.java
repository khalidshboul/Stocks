package com.khalid.Stocks;

public class Stocks {
	private int minPrice;
	private int maxPrice;
	
	
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}
	
	@Override
	public String toString() {
		return "Stocks [minPrice=" + minPrice + ", maxPrice=" + maxPrice + "]";
	}
	
	
	

}
