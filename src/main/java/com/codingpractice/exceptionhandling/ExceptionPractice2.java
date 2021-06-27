package com.codingpractice.exceptionhandling;

public class ExceptionPractice2 {

	public static void main(String[] args) {
		System.out.println(exceptionTest());
	}

	public static int exceptionTest() {
		int i = 6;
		try {
			return i;
		} catch (Exception e) {
			i = 10;
			return i;
		} finally {
			i++;
			System.out.println("In finally block");
		}
	}
}
