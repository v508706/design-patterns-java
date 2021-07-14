package com.designpattern.creational.singleton;
// Java code to explain double check locking 
public class DubleCheckLocking  
{ 
  // private instance, so that it can be 
  // accessed by only by getInstance() method 
  private static DubleCheckLocking instance; 
  
  private DubleCheckLocking()  
  { 
    // private constructor 
  } 
  
  public static DubleCheckLocking getInstance() 
  { 
    if (instance == null)  
    { 
      //synchronized block to remove overhead 
      synchronized (DubleCheckLocking.class) 
      { 
        if(instance==null) 
        { 
          // if instance is null, initialize 
          instance = new DubleCheckLocking(); 
        } 
        
      } 
    } 
    return instance; 
  } 
} 

/**
Pros:

Lazy initialization is possible.
It is also thread safe.
Performance overhead gets reduced because of synchronized keyword.
Cons:

First time, it can affect performance.
As cons. of double check locking method is bearable so it can be used for high performance multi-threaded applications.
*/