package com.sandy;

public class SelectSort {

	public static void main(String[] args) {
		int [] numbs={4,1,6,8,7,2,5,3};
		for (int i = numbs.length-1; i>=0; i--) {
			int max=numbs[0];
			int inx=0;
			System.out.println(i+"...."+max);
			for (int j = 1; j <=i; j++) {
				if (numbs[j]>max) {
					max=numbs[j];
					inx=j;
				}
			}
			numbs[inx]=numbs[i];
			numbs[i]=max;
			System.out.println(i+"...."+numbs[i]);
		}
		System.out.println("===========");
        for (int i : numbs) {
			System.out.println(i);
		}
	}

}
