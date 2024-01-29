package com.onesoft.java8_methodReference;

public class UseStringImplementations {
	public static void main(String[] args) {
		String name="Nisha";
		StringImplementation upper=name::toUpperCase;
		System.out.println(upper.modify());
		StringImplementation lower=name::toLowerCase;
		System.out.println(lower.modify());
		
		StringImplement let=name::charAt;
		System.out.println(let.letter(name.length()-1));
	}

}

@FunctionalInterface
interface StringImplementation {
	public String modify();
}

@FunctionalInterface
interface StringImplement {
	public char letter(int a);
}


