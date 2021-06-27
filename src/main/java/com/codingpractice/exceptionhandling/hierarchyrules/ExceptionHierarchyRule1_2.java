package com.codingpractice.exceptionhandling.hierarchyrules;

import java.io.IOException;

/**
 * Rule 2 -  if parent class method not throwing any exception then child class can throw
 *   no exception 
 *   any unchecked exception
 *  
 * @author sumitsthakur
 *
 */
class Parent2 {

	void callParent() {
		System.out.println("parent class method 2");
	}
}

class Child2 extends Parent2 {
	// even if parent class method is not throwing any exception child class can throw unchecked exception
	void callParent() throws ArithmeticException {
		System.out.println("child class method 2");
	}
}

public class ExceptionHierarchyRule1_2 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 2");
			Parent2 p = new Child2();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 2");
		} finally {
			System.out.println("in finally bolck 2");
		}
	}
}
