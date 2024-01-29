package com.onesoft.java8_static_keyword;

public class Cardiologist implements Doctor{
	
	public String qualification(String qu) {
		return qu;
	}
	
	public int feeCharge(int fees) {
		return fees;
	}
	
	public String workingHours(int hrs) {
		if(hrs>=1&&hrs<=3) {
			return "Specialist";
		}
		else if(hrs>=4&&hrs<=6) {
			return "Duty Doctor";
		}
		else if(hrs>=7&&hrs<=9) {
			return "Nurse";
		}
		else {
			return "Invalid";
		}
	}

}
