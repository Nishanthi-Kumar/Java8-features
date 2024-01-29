
package com.onesoft.java8_default_keyword;

public interface Electronics {
	
	public default String onOff(boolean isOn) {
		if(isOn==true) {
			return "Product is working";
		}
		else {
			return "Product is not working";
		}
	}
	
	public int reSaleValue(int price);

}
