package com.sandy;
/**
冒泡排序（假如从小到大排序）
第一个元素和第二个元素比较大小，如果第一个元素比第二个大，则交换值，
然后第二个元素再和第三个元素比较大小，如果第二个元素比第三个大，则交换值，。。。以此类推
第一遍最大值找到 在末尾，第二遍找到第二大值 在倒数第二位置。。。。以此类推  最终排序完成
*/
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
