package com.codingpractice.exceptionhandling.hierarchyrules;

import java.io.IOException;

/**
 * Rule 2 -  if parent class method is throwing any checked exception then child class can throw
 *   no exception
 *   same parent class exception or any exception which are child class of parent exception
 *   any unchecked excpetion
 *   option 2 + option 3
 *  
 * @author sumitsthakur
 *
 */
class Parent7 {

	void callParent() throws Exception{
		System.out.println("parent class method 7");
	}
}

class Child7 extends Parent7 {
	void callParent() throws IOException, ArithmeticException {
		System.out.println("child class method 7");
	}
}

public class ExceptionHierarchyRule2_4 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 7");
			Parent7 p = new Child7();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 7");
		} finally {
			System.out.println("in finally bolck 7");
		}
	}
}
