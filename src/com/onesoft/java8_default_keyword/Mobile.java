
package com.onesoft.java8_default_keyword;

public class Mobile implements Electronics{
	
	public int reSaleValue(int  price) {
		return price/2;
	}
	
	public String onOff(boolean isOn) {
		if(isOn!=true) {
			return "Product is working";
		}
		else {
			return "Display gone";
		}
	}

}
