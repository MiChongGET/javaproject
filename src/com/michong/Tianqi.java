package com.michong;
/*
 * �����й��������ĳ�����
 * 
 * 
 * */
public class Tianqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capter="ĵ����:101050301��ľ˹:101050401�绯:101050501�ں�:101050601˫Ѽɽ:101051301";
		System.out.println("�ܳ��ȣ�"+capter.length());
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
		
		System.out.println("���У�"+m);
		for(int c=0;c<m;c++){
			System.out.println("��"+String.valueOf(c+1)+"������"+num[c]);
		}
		
		int b=2;
		for(int a=0;a<m-1;a++){
			System.out.println("bΪ��"+b);
			b=num[a+1]-num[a]-10;
			System.out.println(capter.substring(num[a]-b,num[a]+10)+"\n");
		
	}
	}

}
