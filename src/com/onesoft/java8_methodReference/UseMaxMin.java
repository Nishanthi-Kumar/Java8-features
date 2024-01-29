package com.onesoft.java8_methodReference;

public class UseMaxMin {
	public static void main(String[] args) {
		Meth m=new Meth();
		int[]nums= {9,34,6,54,23};
		
		MaxMin fMax=m::findMax;
		System.out.println(fMax.math(nums));
		
		MaxMin fMin=Meth::findMin;
		System.out.println(fMin.math(nums));
		}
}

@FunctionalInterface
interface MaxMin {
	public int math(int []a);
}

class Meth {
	public int findMax(int[]a) {
		int max=a[0];
		for(int x:a) {
			if(x>=max) {
				max=x;
			}
		}
		return max;
	}
	
	public static int findMin(int[]b) {
		int min=b[0];
		for(int x:b) {
			if(x<=min) {
				min=x;
			}
		}
		return min;
	}
}