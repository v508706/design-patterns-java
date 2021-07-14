package com.designpattern.creational.factory;

import java.util.Scanner;

public class FactoryTest {

	/**
	 * 
	 *  The type of object created is decided by separate factory class
	 *  Design pattern basic rule : Always program to an interface
	 *  
	 *  Advantage: 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double a = input.nextDouble();
		System.out.println("Enter the Second number : ");
		double b = input.nextDouble();
		CalculateFactory cf = new CalculateFactory();
		System.out.println("Enter the calculation type : add/divide : ");
		Calculate c = cf.getCalculation(input.next()); 
		c.calculate(a, b);
		
	}

}
