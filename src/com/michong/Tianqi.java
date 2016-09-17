package com.michong;

public class Tianqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capter="北京:101010100朝阳:101010300顺义:101010400怀柔:101010500通州:101010600昌平:101010700延庆:101010800丰台:101010900石景山:101011000大兴:101011100房山:101011200密云:101011300门头沟:101011400平谷:101011500八达岭:101011600佛爷顶:101011700汤河口:101011800密云上甸子:101011900斋堂:101012000霞云岭:101012100北京城区:101012200";
		
		for(int n=0;n<capter.length()+11;n=n+12){
			
		System.out.println(capter.substring(n,n+12)+"\n");
		}
	}

}
