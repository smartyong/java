package com.shanghaionstar.dealerinfo.bean;

public class NomalPriceStrategy implements PriceStrategy {

	/**
	 * none discount
	 */
	@Override
	public Double getPrice(Double price) {
		
		return price;
	}

}
