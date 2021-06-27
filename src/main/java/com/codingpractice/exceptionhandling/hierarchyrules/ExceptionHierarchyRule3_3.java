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
class Parent3_3 {

	void callParent() throws ArithmeticException{
		System.out.println("parent class method 3_3");
	}
}

class Child3_3 extends Parent3_3 {
	//compile time exception at below line
	void callParent() throws IOException {
		System.out.println("child class method 3_3");
	}
}

public class ExceptionHierarchyRule3_3 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 3_3");
			Parent3_3 p = new Child3_3();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 3_3");
		} finally {
			System.out.println("in finally bolck 3_3");
		}
	}
}
