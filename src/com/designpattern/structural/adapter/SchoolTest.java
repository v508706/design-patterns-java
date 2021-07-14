package com.designpattern.structural.adapter;

public class SchoolTest {

	/**
	 * 
	 * The adapter pattern convert the interface of a class into another interface clients expect. 
	 * Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
	 * 
	 * To use an adapter:
		
		The client makes a request to the adapter by calling a method on it using the target interface.
		The adapter translates that request on the adaptee using the adaptee interface.
		Client receive the results of the call and is unaware of adapter’s presence.
	 */
	public static void main(String[] args) {
		
		Pen pp = new PenAdapter();
		AssignmentWork aw= new AssignmentWork();
		aw.setPen(pp);
		aw.witeAssignment("Assigment notes");
	}
}
