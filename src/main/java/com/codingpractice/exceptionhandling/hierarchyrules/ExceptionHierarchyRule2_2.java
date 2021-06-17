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
class Parent5 {

	void callParent() throws Exception{
		System.out.println("parent class method 5");
	}
}

class Child5 extends Parent5 {
	void callParent() throws Exception, IOException {
		System.out.println("child class method 5");
	}
}

public class ExceptionHierarchyRule2_2 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 5");
			Parent5 p = new Child5();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 5");
		} finally {
			System.out.println("in finally bolck 5");
		}
	}
}
