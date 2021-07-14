package com.designpattern.structural.adapter;

public class AssignmentWork  {
	
	private Pen pen;
	
	public void witeAssignment(String s) {
		pen.write(s);
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

}
