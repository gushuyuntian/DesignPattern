package com.pattern.AbstractFactory.demo2;

public class BMWSuv extends AbsBMW {

	private final static String X_SEARIES = "X系列车型SUV";
	
	@Override
	public String getModel() {
		return X_SEARIES;
	}

}
