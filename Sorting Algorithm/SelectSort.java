package com.sandy;
/**
选择排序（假设从小到大排序）
第一个元素依次和第二个，第三个，。。。第N个元素比较大小，比较后选出最大值， 然后最大值元素和末尾元素互换， 末尾位置为最大值，
第二遍，第一个元素依次和第二个，第三个，。。。第N-1个元素比较大小，比较后选出最大值，然后最大值元素和n-1元素互换 n-1位置为次大值，
以此类推
*/
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
