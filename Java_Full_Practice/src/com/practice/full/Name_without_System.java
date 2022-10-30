package com.practice.full;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Name_without_System {
	

	public static void main(String[] args)  {
		
		
		
		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.append("Sirajudeen");
	

	}

}
