package com.michong;

public class Tianqi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capter="����:101010100����:101010300˳��:101010400����:101010500ͨ��:101010600��ƽ:101010700����:101010800��̨:101010900ʯ��ɽ:101011000����:101011100��ɽ:101011200����:101011300��ͷ��:101011400ƽ��:101011500�˴���:101011600��ү��:101011700���ӿ�:101011800�����ϵ���:101011900ի��:101012000ϼ����:101012100��������:101012200";
		
		for(int n=0;n<capter.length()+11;n=n+12){
			
		System.out.println(capter.substring(n,n+12)+"\n");
		}
	}

}
