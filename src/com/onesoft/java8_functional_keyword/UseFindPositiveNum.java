package com.onesoft.java8_functional_keyword;

public class UseFindPositiveNum {
	public static void main(String[] args) {
		
		FindPositiveNum f= (a)-> {
			for(int i=0;i<a.length;i++) {
				if(a[i]>0) {
					System.out.println(a[i]);
				}
			}
		};
		
		int[]arr= {-2,5,-6,7,9};
		f.findPos(arr);
	}

}
