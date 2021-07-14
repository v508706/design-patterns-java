package com.designpattern.creational.builder;

public class BuilderTest {

	/**
	 * Builder pattern aims to “Separate the construction of a complex object from its representation 
	 * so that the same construction process can create different representations.” 
	 * It is used to construct a complex object step by step and the final step will return the object.
	 *  The process of constructing an object should be generic so that it can be used to create different 
	 *  representations of the same object.
	 *  
	 *  
	 *  Advantage :
	 *  The parameters to the constructor are reduced and are provided in highly readable method calls.
		Builder design pattern also helps in minimizing the number of parameters in constructor and thus there is no need to pass in null for optional parameters to the constructor.
		Object is always instantiated in a complete state
		Immutable objects can be build without much complex logic in object building process.
		
		Disadvantage:
		The number of lines of code increase at least to double in builder pattern, but the effort pays off in terms of design flexibility and much more readable code.
		Requires creating a separate ConcreteBuilder for each different type of Product.
	 */
	public static void main(String[] args) {
		
		Phone phone = new Phone("Android", 128, "sanpdragon", 7.1, 3000);
		System.out.println(phone);
		 
		Phone iphone = new PhoneBuilder()
				.setOs("IOS").
				setRam(256).
				getPhone();
		System.out.println(iphone);
	}
}
