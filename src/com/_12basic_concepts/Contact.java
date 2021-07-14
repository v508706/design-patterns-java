package com._12basic_concepts;

public class Contact {

	public String name;
	
	public String toString() {
		String temp = "";
		if(this instanceof Friend) {
			temp = "Friend Name :"+name+" ph: "+((Friend)this).phoneNumber;
		}else if(this instanceof Work) {
			temp = "Work Name :"+name+" ph: "+((Work)this).email;
		}
		return temp;
	}
	
}
