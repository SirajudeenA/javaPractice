package com.practice.full;

public class Inheritance_Child extends Inheritance_Parent {
	
	public void data4() {
		System.out.println("this is data 4 ");// TODO Auto-generated method stub

	}
	public void data5() {
	System.out.println("this is data 5");	// TODO Auto-generated method stub

	}
	
	

	public static void main(String[] args) {
		Inheritance_Child simple = new Inheritance_Child();
		System.out.println("THIS IS THE EXAMPLE OF SINGLE INHERITANCE WHERE ONLY 1 CHILD INHERITS PROPERTY OF PARENT");
		simple.data1();
		simple.data2();
		simple.data3();
		
	}

}
