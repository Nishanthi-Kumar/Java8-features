package com.onesoft.java8_optionalClass;

import java.util.Optional;

public class PraticeProgram {
	public static void main(String[] args) {
		
		String name= null;
//		String z=name.toLowerCase();
		Optional<String>a=Optional.ofNullable(name);
		if(a.isPresent()) {
			System.out.println(name.toUpperCase());
		}
		else {
			System.out.println("String is null");
		}
		//System.out.println(a.orElse("Out of stock"));
		
	}

}
