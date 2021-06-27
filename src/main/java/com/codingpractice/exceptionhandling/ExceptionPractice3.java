package com.codingpractice.exceptionhandling;

public class ExceptionPractice3 {

	public static void main(String args[]) {
		try {
			throw 10; // compile time exception
		} catch (int e) {
			System.out.println("Got the  Exception " + e);
		}
	}

}
