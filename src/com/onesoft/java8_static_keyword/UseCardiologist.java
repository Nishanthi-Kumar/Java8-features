package com.onesoft.java8_static_keyword;

public class UseCardiologist {
	public static void main(String[] args) {
		
		Cardiologist c=new Cardiologist();
		System.out.println(c.qualification("MBBS"));
		System.out.println(c.feeCharge(1500));
		System.out.println(c.workingHours(4));
		System.out.println(Doctor.workingHours(4));
	}

}
