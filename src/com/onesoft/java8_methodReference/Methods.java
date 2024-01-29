package com.onesoft.java8_methodReference;

public class Methods {
	
	public static int findMax(int[]a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	
	public String findMin(String[]b) {
		String min=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i].length()>min.length()) {
				min=b[i];
			}
		}
		return min;
	}

}
