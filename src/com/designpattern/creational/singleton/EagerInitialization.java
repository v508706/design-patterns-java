package com.designpattern.creational.singleton;
// Java code to create singleton class by 
// Eager Initialization 
public class EagerInitialization 
{ 
// public instance initialized when loading the class 
private static final EagerInitialization instance = new EagerInitialization(); 

private EagerInitialization() 
{ 
	// private constructor 
} 
public static EagerInitialization getInstance(){ 
		return instance; 
	} 
} 

/**
Pros:

Very simple to implement.
Cons:

May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
Exception handling is not possible.
*/