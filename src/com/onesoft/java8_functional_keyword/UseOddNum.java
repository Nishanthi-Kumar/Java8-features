package com.onesoft.java8_functional_keyword;

import java.util.ArrayList;
import java.util.List;

public class UseOddNum {
	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<>();
		nums.add(23);nums.add(34);nums.add(34);nums.add(77);
		
		List<Integer> list1=new ArrayList<>();
		
		FindOddNum o=(a)->{
			for(Integer x:a) {
				if(x%2!=0) {
					list1.add(x);
				}
			}
			//list1.forEach(z->System.out.println(z));
			return list1;
			
		};
		
		System.out.println(o.oddNum(nums));
		
	}

}
