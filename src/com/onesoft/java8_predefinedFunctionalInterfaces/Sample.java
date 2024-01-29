package com.onesoft.java8_predefinedFunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Sample {
	public static void main(String[] args) {
		
		Function<Integer,Integer>a=(x)->x+1000;
		System.out.println(a.apply(200));
		
		Consumer<Integer>b=(x)->System.out.println(x+100);
		b.accept(200);
		
		Supplier<String>c=()->"Hello";
		System.out.println(c.get());
		
		Predicate<Integer>d=(x)-> x>100;
		System.out.println(d.test(200));
		
	}

}
