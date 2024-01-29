package com.onesoft.java8_functional_keyword;

public class UseMobile {
	public static void main(String[] args) {
		
		Mobile m=(a)-> {if(a>50000) { return "NewMob";}else {return "OldMob";}};
		System.out.println(m.price(30000));
	}

}
