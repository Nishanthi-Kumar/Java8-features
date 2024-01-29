package com.onesoft.java8_functional_keyword;


public interface Calculator {
	
	public int math(int a, int b);
	//public int some(int num,int n1);
	public static void printOperation(String a) {
		System.out.println(a);
	}
	public default void activity() {
		System.out.println("calc interface");
	}

}
