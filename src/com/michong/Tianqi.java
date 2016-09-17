package com.michong;
/*
 * 解析中国天气网的城市码
 * 
 * 
 * */
public class Tianqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capter="牡丹江:101050301佳木斯:101050401绥化:101050501黑河:101050601双鸭山:101051301";
		System.out.println("总长度："+capter.length());
		int[] num =new int[5];
		char s=':';
		int m=0;
		for(int i=0;i<capter.length();i++){
			if(capter.charAt(i)==s){
				System.out.println(i+"\n");
				num[m]=i;
				m++;
			}
			
		}
		
		System.out.println("共有："+m);
		for(int c=0;c<m;c++){
			System.out.println("第"+String.valueOf(c+1)+"个数组"+num[c]);
		}
		
		int b=2;
		for(int a=0;a<m-1;a++){
			System.out.println("b为："+b);
			b=num[a+1]-num[a]-10;
			System.out.println(capter.substring(num[a]-b,num[a]+10)+"\n");
		
	}
	}

}
