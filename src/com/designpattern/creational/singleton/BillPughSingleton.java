package com.designpattern.creational.singleton;
// Java code for Bill Pugh Singleton Implementaion 
public class BillPughSingleton 
{ 

private BillPughSingleton() 
{ 
	// private constructor 
} 

// Inner class to provide instance of class 
private static class BillPughSingletonCreator 
{ 
	private static final BillPughSingleton INSTANCE = new BillPughSingleton(); 
} 

public static BillPughSingleton getInstance() 
{ 
	return BillPughSingletonCreator.INSTANCE; 
} 
} 

/**
When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class. Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy initialization.
This is the most widely used approach as it doesn’t use synchronization.
*/