package com.designpattern.creational.factory;

public class Add implements Calculate{

	public void calculate(double a, double b) {
		System.out.println("a+b :"+(a+b));
	}
	
}
