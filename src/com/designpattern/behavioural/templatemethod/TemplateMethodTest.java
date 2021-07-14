package com.designpattern.behavioural.templatemethod;

public class TemplateMethodTest {

	/**
	 * Template method : subclasses decide how to implement steps in algorithm
	 */
	
	public static void main(String[] args) {
		
		ExcelFile ef = new ExcelFile();
		/*
		 * ef.readData(); ef.processData(); ef.saveData();
		 */
		ef.readProcessAndSave();
		
		TextFile tf = new TextFile();
		/*
		 * tf.readData(); tf.processData(); tf.saveData();
		 */
		tf.readProcessAndSave();
	}
}
