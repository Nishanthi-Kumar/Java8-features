package com.onesoft.java8_static_keyword;

public interface Doctor {
	
	public String qualification(String qu);
	public int feeCharge(int fees);
	public static String workingHours(int hrs) {
		if(hrs>=2&&hrs<=4) {
			return "Specialist";
		}
		else if(hrs>=5&&hrs<=8) {
			return "Duty Doctor";
		}
		else {
			return "Invalid";
		}
	}

}
