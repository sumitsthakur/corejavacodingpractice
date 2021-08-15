package com.codingpractice.exceptionhandling;

public class ExceptionPractice2 {

	public static void main(String[] args) {
		System.out.println(exceptionTest());
	}

	public static int exceptionTest() {
		int i = 6;
		try {
			i=i/0;
			return i;
		} catch (Exception e) {
			i = 10;
			System.out.println("in catch block"+i);
			return i;
		} finally {
			i=i+1;
			System.out.println("In finally block"+i);
			return i; //not good practice to return from finally block
		}
	}
}
