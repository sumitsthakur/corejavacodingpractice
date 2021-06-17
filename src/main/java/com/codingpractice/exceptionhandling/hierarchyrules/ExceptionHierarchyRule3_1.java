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
class Parent3_1 {

	void callParent() throws ArithmeticException{
		System.out.println("parent class method 3_1");
	}
}

class Child3_1 extends Parent3_1 {
	void callParent() {
		System.out.println("child class method 3_1");
	}
}

public class ExceptionHierarchyRule3_1 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 3_1");
			Parent3_1 p = new Child3_1();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 3_1");
		} finally {
			System.out.println("in finally bolck 3_1");
		}
	}
}
