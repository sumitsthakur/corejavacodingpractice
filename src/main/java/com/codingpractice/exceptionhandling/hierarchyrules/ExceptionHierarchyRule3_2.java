package com.codingpractice.exceptionhandling.hierarchyrules;

import java.io.IOException;

/**
 * Rule 2 -  if parent class method is throwing any unchecked exception then child class can throw
 *   no exception
 *   any unchecked excpetion
 *  
 * @author sumitsthakur
 *
 */
class Parent3_2 {

	void callParent() throws ArithmeticException{
		System.out.println("parent class method 3_2");
	}
}

class Child3_2 extends Parent3_2 {
	void callParent() throws NullPointerException {
		System.out.println("child class method 3_2");
	}
}

public class ExceptionHierarchyRule3_2 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 3_2");
			Parent3_2 p = new Child3_2();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 3_2");
		} finally {
			System.out.println("in finally bolck 3_2");
		}
	}
}
