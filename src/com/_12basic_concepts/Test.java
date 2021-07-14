package com._12basic_concepts;

public class Test {
	
	/*
	 * Creational 
	 * 	Factory => The type of object created is decided by separate factory class
	 * 	Abstract Factory =>
	 * 	Singleton
	 * 	Prototype
	 * 	Builder Pattern =>
	 * 	Object Pool Pattern
	 * 
	 * Basics : https://www.youtube.com/user/DURGAEDUCATION/videos
	 */

	public static void main(String[] args) {
		
		/**System.out.println("A object");
		A aobj = new A();
		aobj.methodA();*/
		
		System.out.println("B object");
		B bobj = new B();
		bobj.methodA();
		bobj.methodB();
		
		System.out.println("A or B object");
		A obj = new B();
		obj.methodA();

	}

}
