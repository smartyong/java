package com.shanghaionstar.dealerinfo.bean;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] numbs={1,3,6,4,7,2,5,8};
		for (int j=numbs.length;j>0;j--) {
			for (int i = 0; i+1 <j; i++) {
				int temp=0;
				if (numbs[i]>numbs[i+1]) {
					temp=numbs[i];
					numbs[i]=numbs[i+1];
					numbs[i+1]=temp;
				}
			}
		}
		for (int i : numbs) {
			System.out.println(i);
		}
	}

}
