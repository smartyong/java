package com.shanghaionstar.dealerinfo.bean;

import java.util.List;

public class Order {
    private Double totalPrice;
	private List<Iterm> iterms;

	public List<Iterm> getIterms() {
		return iterms;
	}

	public void setIterms(List<Iterm> iterms) {
		this.iterms = iterms;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
		
}
