package com.shanghaionstar.dealerinfo.bean;

public class HappyPriceStrategy implements PriceStrategy {

	/**
	 * half discount
	 */
	@Override
	public Double getPrice(Double price) {
		
		return price*0.5;
	}

}
