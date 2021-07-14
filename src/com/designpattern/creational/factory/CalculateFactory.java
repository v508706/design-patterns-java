package com.designpattern.creational.factory;

public class CalculateFactory {
	
	public Calculate getCalculation(String type) {
		if(type.equals("add")) {
			return new Add();
		}else if(type.equals("divide")) {
			return new Divide();
		}else {
			System.out.println("We don't do that ..");
		}
		return null;
	}

}
