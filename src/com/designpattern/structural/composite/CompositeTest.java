package com.designpattern.structural.composite;

public class CompositeTest {
	
	/**
	 * 
	 * Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies
 		It allows you to have a tree structure and ask each node in the tree structure to perform a task.
	 *  The Composite Pattern has four participants:		
		Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
		Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
		Composite – Composite stores child components and implements child related operations in the component interface.
		Client – Client manipulates the objects in the composition through the component interface.
	 */
	public static void main(String[] args) {
	 
		Component mouse = new Leaf("mouse",500);
		Component keyboard = new Leaf("keyboard",700);
		Component monitor = new Leaf("monitor",6000);
		
		Component mb = new Leaf("motherboard",8000);
		Component ram = new Leaf("ram",3000);
		
		Composite ph = new Composite("pheripheral");
		ph.addComponent(mouse);
		ph.addComponent(keyboard);
		ph.addComponent(monitor);
		
		Composite cabinet = new Composite("Cabinet");
		cabinet.addComponent(mb);
		cabinet.addComponent(ram);
		
		Composite computer = new Composite("Computer");
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		
		computer.showPrice();
		
		
	
	}

}
