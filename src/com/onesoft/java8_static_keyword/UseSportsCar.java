package com.onesoft.java8_static_keyword;

public class UseSportsCar {
	public static void main(String[] args) {
		
		SportsCar s=new SportsCar();
		System.out.println(s.findPrice(800000));
		System.out.println(s.findBrand("Yamaha"));
		System.out.println(Car.findBrand("Audi"));
		
		s.activity();
		
		
	}

}
