package com.shanghaionstar.dealerinfo.bean;

public class Iterm {
	
	private String name;
	private Double price;
	private PriceStrategy priceStrategy;
	
	public Iterm(String name, Double price,PriceStrategy priceStrategy) {
		super();
		this.name = name;
		this.price = price;
		this.priceStrategy=priceStrategy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public PriceStrategy getPriceStrategy() {
		return priceStrategy;
	}

	public void setPriceStrategy(PriceStrategy priceStrategy) {
		this.priceStrategy = priceStrategy;
	}
	
	
}
