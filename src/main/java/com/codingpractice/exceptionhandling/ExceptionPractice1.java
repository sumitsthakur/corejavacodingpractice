package com.codingpractice.exceptionhandling;

public class ExceptionPractice1 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block ");
			/*
			 * After executing below line jvm terminates the program
			 */
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Inside catch block");
		} finally {
			System.out.println("Inside finally block");
		}
	}
}
