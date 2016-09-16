package com.michong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// ʹ��format()����������ת��Ϊָ����ʽ���ı�
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
		// ����Date���󣬱�ʾ��ǰʱ��
        Date now= new Date();
        
        // ����format()������������ת��Ϊ�ַ��������
		System.out.println( sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));

		// ʹ��parse()�������ı�ת��Ϊ����
		String d = "2014-6-1 21:05:36";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
         // ����parse()���������ַ���ת��Ϊ����
		Date date = null;
		try {
			date = sdf.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		System.out.println(date);
	}

}
