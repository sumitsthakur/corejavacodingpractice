package com.codingpractice.exceptionhandling;

public class ExceptionPractice4 {

	public static void main(String[] args) {
		try {
			System.out.printf("1");
			int data = 5 / 0;
		} catch (ArithmeticException e) {
			Throwable obj = new Throwable("Sample");
			try {
				throw obj;
			} catch (Throwable e1) {
				System.out.printf("8");
			}
		} finally {
			System.out.printf("3");
		}
		System.out.printf("4");
	}

}
