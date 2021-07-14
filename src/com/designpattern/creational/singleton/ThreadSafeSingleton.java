package com.designpattern.creational.singleton;
// Java program to create Thread Safe 
// Singleton class 
public class ThreadSafeSingleton  
{ 
  // private instance, so that it can be 
  // accessed by only by getInstance() method 
  private static ThreadSafeSingleton instance; 
  
  private ThreadSafeSingleton()  
  { 
    // private constructor 
  } 
  
 //synchronized method to control simultaneous access 
  synchronized public static ThreadSafeSingleton getInstance()  
  { 
    if (instance == null)  
    { 
      // if instance is null, initialize 
      instance = new ThreadSafeSingleton(); 
    } 
    return instance; 
  } 
} 

/**
Pros:

Lazy initialization is possible.
It is also thread safe.
Cons:

getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
*/