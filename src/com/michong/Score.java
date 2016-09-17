package com.michong;
class Outer{
	
	int score=95;
	
	void inst(final int s){
		final int temp=20;
	 	
		class Inner{
			void display(){
				System.out.println("成绩："+(score+s+temp));
			}
		}
		
		Inner inner= new Inner();
		inner.display();
	}
}
public class Score {

	public static void main(String[] args) {

		Outer out = new Outer();
		out.inst(50);
		double num;
		num=length(12, 15);
		System.out.println("对角线的长度："+num);
	}
	public static double length(int m,int n){
		return Math.sqrt(m*m+n*n);
	}
}


