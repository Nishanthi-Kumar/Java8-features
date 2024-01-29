package com.onesoft.java8_static_keyword;

public class SportsCar implements Car{
	
	public String findPrice(int price) {
		return "Price="+price;
	}
	
	public String findBrand(String brand) {
		return "Brand="+brand;
	}
	
	public void activity() {
		System.out.println("calc interface overrided");
	}

	
}
