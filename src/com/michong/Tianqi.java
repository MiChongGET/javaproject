package com.michong;
/*
 * 解析中国天气网的城市码
 * 
 * 使用 正则的方法自定义规则，使得代码大大的简洁了
 String capter="北京:101010100朝阳:101010300顺义:101010400怀柔:101010500通州:101010600昌平:101010700延庆:101010800丰台:101010900石景山:101011000大兴:101011100房山:101011200密云:101011300门头沟:101011400平谷:101011500八达岭:101011600佛爷顶:101011700";
        String regex = "\\W+\\:";
        String regex2 = "\\w{9}";
        String[] num = capter.split(regex);
        String[] name = capter.split(regex2);
        for (int i = 0; i <num.length-1;i++) {
            System.out.print(name[i]);
            System.out.print(num[i+1]);
            System.out.println("");
        }
 
 
 
 * */
public class Tianqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capter="北京:101010100朝阳:101010300顺义:101010400怀柔:101010500通州:101010600昌平:101010700延庆:101010800丰台:101010900石景山:101011000大兴:101011100房山:101011200密云:101011300门头沟:101011400平谷:101011500八达岭:101011600佛爷顶:101011700";
		System.out.println("总长度："+capter.length());
		char s=':';
		int d=0;
		for(int i=0;i<capter.length();i++){
			if(capter.charAt(i)==s){
				d++;
			}	
		}
		
		int[] num =new int[d];
		
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
			//System.out.println("b为："+b);
			b=num[a+1]-num[a]-10;
			//第一个城市
			if(a==0){
		     System.out.println(capter.substring(num[a]-b,num[a]+10)+"\n");
			}
			//剩下的城市
			System.out.println(capter.substring(num[a+1]-b,num[a+1]+10)+"\n");
		
	}
	}

}
