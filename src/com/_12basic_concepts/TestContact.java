package com._12basic_concepts;

public class TestContact {

	public static void main(String[] args) {
		
		
	Contact contact1 = new Friend();
	contact1.name="Alex";
	((Friend)contact1).phoneNumber="987896786";

	Contact contact2 = new Work();
	contact2.name = "Bruce";
	((Work)contact2).email="bruce@email.com";
	
	System.out.println(contact1);
	System.out.println(contact2);
	}

}
