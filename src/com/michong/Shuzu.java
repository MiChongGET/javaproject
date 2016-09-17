package com.michong;

public class Shuzu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = {12,454,489,4,45,356,47,12,47,8};
		max(arrs);
	}
	public static void max(int arrs[]){
		int mun = arrs[0];
		for(int i=0;i<arrs.length;i++){
			if(mun <arrs[i]){
				mun =arrs[i];
			}
		}
		System.out.println("最大的数是："+mun);
		
	}

}
