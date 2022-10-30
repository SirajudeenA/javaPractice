package com.practice.full;

public class Second_Child extends Inheritance_Parent implements Multipe_inheritance{

	public static void main(String[] args) {
		
Second_Child s1=new Second_Child();
System.out.println("HERE SECOND CHILD ALSO INHERITES THE PROPERTY OF PARENT CLASS ");
System.out.println("SO A PARENT CAN HAVE MULTIPLE CHILD ITS CALLED HIERARCHIAL INHERITANCE");
s1.data1();
s1.data2();
s1.data3();
s1.data_Interface();
s1.data_Inherface2();

	}

	@Override
	public void data_Interface() {
		
		System.out.println("HERE A CHILD CLASS GET PROPERTY FROM TWO DIFFERENT PARENTS");
		System.out.println();
	System.out.println("this is retreived from interface");	// TODO Auto-generated method stub
		
	}

	@Override
	public void data_Inherface2() {
		System.out.println("this is called multiple inheritance");// TODO Auto-generated method stub
		
	}

}
