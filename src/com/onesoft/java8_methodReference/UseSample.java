package com.onesoft.java8_methodReference;

public class UseSample {
	public static void main(String[] args) {
		
		Methods m= new Methods();
		
		Sample s= Methods::findMax;
		int[]arrs= {5,7,8,3,2};
		s.maxInt(arrs);
		
		Sample1 s1=m::findMin;
		String[]arrs1= {"sun","cat","moon","nisha"};
		System.out.println(s1.maxString(arrs1));
		
		PrintName p=String::toUpperCase;
		System.out.println(p.name("Nisha"));
	}

	
}
