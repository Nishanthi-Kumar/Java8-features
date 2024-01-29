package com.onesoft.java8_static_keyword;

@FunctionalInterface
public interface Car {
	
	public String findPrice(int price);
	
	public static String findBrand(String brand) {
		return brand;
	}
	
	public default void activity() {
		System.out.println("calc interface");
	}
	
	//public int test(String test);
	

}
