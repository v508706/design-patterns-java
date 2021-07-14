package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

interface Component {
	void showPrice();
}

class Leaf implements Component {
	private String name;
	private double price;
	
	
	public Leaf(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}



	@Override
	public void showPrice() {	
		System.out.println(name +": "+price);		
	}
	
	
}

class Composite implements Component{
	private String name;
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	List<Component> components= new ArrayList<>();
	
	public void addComponent(Component component) {
		components.add(component);
	}
	
	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component component:components) {
			component.showPrice();
		}
		
	}
	
}