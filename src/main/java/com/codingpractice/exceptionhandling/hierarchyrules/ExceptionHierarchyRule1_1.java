package com.codingpractice.exceptionhandling.hierarchyrules;

import java.io.IOException;

/**
 * Rule 1 -  if parent class method not throwing any exception then child class can throw
 *   no exception 
 *   any unchecked exception
 *  
 * @author sumitsthakur
 *
 */
class Parent1 {

	void callParent() {
		System.out.println("parent class method 1");
	}
}

class Child1 extends Parent1 {
	void callParent() {
		System.out.println("child class method 1");
	}
}

public class ExceptionHierarchyRule1_1 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 1");
			Parent1 p = new Child1();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 1");
		} finally {
			System.out.println("in finally bolck 1");
		}
	}
}
