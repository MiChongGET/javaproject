package com.michong;
/*
 * �����й��������ĳ�����
 * 
 * 
 * */
public class Tianqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capter="����:101010100����:101010300˳��:101010400����:101010500ͨ��:101010600��ƽ:101010700����:101010800��̨:101010900ʯ��ɽ:101011000����:101011100��ɽ:101011200����:101011300��ͷ��:101011400ƽ��:101011500�˴���:101011600��ү��:101011700";
		System.out.println("�ܳ��ȣ�"+capter.length());
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
		
		System.out.println("���У�"+m);
		for(int c=0;c<m;c++){
			System.out.println("��"+String.valueOf(c+1)+"������"+num[c]);
		}
		
		int b=2;
		for(int a=0;a<m-1;a++){
			//System.out.println("bΪ��"+b);
			b=num[a+1]-num[a]-10;
			//��һ������
			if(a==0){
		     System.out.println(capter.substring(num[a]-b,num[a]+10)+"\n");
			}
			//ʣ�µĳ���
			System.out.println(capter.substring(num[a+1]-b,num[a+1]+10)+"\n");
		
	}
	}

}
