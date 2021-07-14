package com.designpattern.behavioural.templatemethod;

public class TextFile extends DataProcessor{

	public void readData() {
		System.out.println("TextFile : Read Data from File");
	}
	
	public void processData() {
		System.out.println("TextFile : Process Data from File");
	}
	
	 
	/*
	 * public void readProcessAndSave() { readData(); processData(); saveData(); }
	 */
	
}
