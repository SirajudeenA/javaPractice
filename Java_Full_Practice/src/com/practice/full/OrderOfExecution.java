package com.practice.full;

public class OrderOfExecution {

	public OrderOfExecution() {
		System.out.println("This is Constructor Block");
	}

	static {
		System.out.println("this is Static Block");
	}

	{
		System.out.println("this is instance Block");
	}

	private void diplay() {
		System.out.println("This is display Method");
	}

	public static void main(String[] args) {
		OrderOfExecution ref = new OrderOfExecution();
		ref.diplay();

	}

}
