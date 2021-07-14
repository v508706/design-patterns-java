package com.designpattern.behavioural.templatemethod;

public class ExcelFile extends DataProcessor{

	public void readData() {
		System.out.println("ExcelFile : Read Data from File");
	}
	
	public void processData() {
		System.out.println("ExcelFile : Process Data from File");
	}
	/*
	 * public void readProcessAndSave() { readData(); processData(); saveData(); }
	 */
}
