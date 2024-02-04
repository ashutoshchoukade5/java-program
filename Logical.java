package com.operator.demo;

public class Logical {

	public static void main(String[] args) {
		int a=23;
		int b=33;
		int c=5;
		
		System.out.println(a>b & b<c);//false
		System.out.println(a<b && b>c);//true 
		
		System.out.println(a>b || b>c);//true
		System.out.println(c>a || b<a);//false
	
	}

}
