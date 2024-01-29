package com.onesoft.java8_optionalClass;

import java.util.Optional;

public class OptionalProgram {
	public static void main(String[] args) {
		String a=null;
		//System.out.println(a.length());
		
//		Optional<String>check1=Optional.empty();
//		System.out.println(check1);
		Optional<String>check2=Optional.ofNullable(a);
		
//		System.out.println(check1.isPresent());
//		System.out.println(check1.isEmpty());
		
//		if(check1.isPresent()) {
//			System.out.println(a.length());
//		}
//		else {
//			System.out.println("Value is null");
//		}
//		System.out.println(check1.orElse("The value is not present"));
	}

}
