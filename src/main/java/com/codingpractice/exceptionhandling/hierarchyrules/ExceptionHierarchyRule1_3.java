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
class Parent3 {

	void callParent() {
		System.out.println("parent class method 3");
	}
}

class Child3 extends Parent3 {
	//compile time exception, child class method can not have checked excpetion if parent class is not throwing any exception
	void callParent() throws IOException{
		System.out.println("child class method 3");
	}
}

public class ExceptionHierarchyRule1_3 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 3");
			Parent3 p = new Child3();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 3");
		} finally {
			System.out.println("in finally bolck 3");
		}
	}
}
