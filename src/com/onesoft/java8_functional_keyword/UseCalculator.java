package com.onesoft.java8_functional_keyword;

public class UseCalculator {
	public static void main(String[] args) {
		
		Calculator add=(a,b)->{return a+b;};
		System.out.println(add.math(10, 20));
		add.activity();
		Calculator.printOperation("sjh");
	}

}
