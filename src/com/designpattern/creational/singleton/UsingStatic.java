package com.designpattern.creational.singleton;
// Java code to create singleton class 
// Using Static block 
public class UsingStatic  
{ 
  // public instance 
  public static UsingStatic instance; 
  
  private UsingStatic()  
  { 
    // private constructor 
  } 
static
  { 
    // static block to initialize instance 
    instance = new UsingStatic(); 
  } 
} 

/**
Pros:

Very simple to implement.
No need to implement getInstance() method. Instance can be accessed directly.
Exceptions can be handled in static block.
Cons:

May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
*/
