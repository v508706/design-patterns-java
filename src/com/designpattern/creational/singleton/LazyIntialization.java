package com.designpattern.creational.singleton;
//Java Code to create singleton class 
// With Lazy initialization 
public class LazyIntialization  
{ 
  // private instance, so that it can be 
  // accessed by only by getInstance() method 
  private static LazyIntialization instance; 
  
  private LazyIntialization()  
  { 
    // private constructor 
  } 
  
  //method to return instance of class 
  public static LazyIntialization getInstance()  
  { 
    if (instance == null)  
    { 
      // if instance is null, initialize 
      instance = new LazyIntialization(); 
    } 
    return instance; 
  } 
} 

/**
Pros:

Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
Exception handling is also possible in method.
Cons:

Every time a condition of null has to be checked.
instance can’t be accessed directly.
In multithreaded environment, it may break singleton property.
*/