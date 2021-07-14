package com.designpattern.structural.adapter;

public class PenAdapter implements Pen {

	PilotPen pp = new PilotPen();
	
	@Override
	public void write(String s) {
		//translate the request to adaptee format
		pp.mark(s);
		
	}
}
