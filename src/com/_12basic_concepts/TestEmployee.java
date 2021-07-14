package com._12basic_concepts;

public abstract class TestEmployee {

	public static void main(String[] args) {
		 Email email = new OutlookEmail();
		 Employee obj1 = new Employee(100, "Mani", email);
		 obj1.notifyEmail();
		 
		 email = new WebserviceEmail();
		 Employee obj2 = new Employee(200, "Kishore", email);
		 obj2.notifyEmail();
		 

	}

}
