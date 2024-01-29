package com.onesoft.java8_methodReference;

public class UseSample1 {
public static void main(String[] args) {
		
		Methods m= new Methods();
		
		Sample1 s1=m::findMin;
		String[]arrs1= {"sun","cat","moon","nisha"};
		System.out.println(s1.maxString(arrs1));
	}


}
