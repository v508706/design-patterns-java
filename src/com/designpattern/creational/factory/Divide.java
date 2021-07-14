package com.designpattern.creational.factory;

public class Divide implements Calculate{

	public void calculate(double a, double b) {
		System.out.println("a/b :"+a/b);
	}
	
}
