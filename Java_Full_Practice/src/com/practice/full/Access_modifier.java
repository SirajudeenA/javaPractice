package com.practice.full;

public class Access_modifier {

	private void accessLevel_private() {
//here we used the Access modifier Private so its can be Accessed only in this perticular class");
	}

	void accessLevel_default() {
//here we did not mention any Access modifier so its default Access modifier its property can be accessed
		// within the class ,another class within the same package but it can be
		// accessed through other package

	}

	protected void accessLevel_Protected() {
		// here we use protected , so it can accessed within package different class as
		// well

	}

	public void accessLevel_Public() {
		// its a global access modifier it can be accessed from any package any project

	}
	
	

	public static void main(String[] args) {

		// Ecncaptulation - binding the code and data together is called encaptulation
		// what ever we write inside the flower bracket {} is called encaptulation
		// example
		System.out.println("This is the example of encaptulation " + "\n"
				+ "here we combine the code system.out.println with data mentioned in double cote");

	}

}
