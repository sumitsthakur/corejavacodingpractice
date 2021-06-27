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
class Parent4 {

	void callParent() throws Exception{
		System.out.println("parent class method 4");
	}
}

class Child4 extends Parent4 {
	void callParent() {
		System.out.println("child class method 4");
	}
}

public class ExceptionHierarchyRule2_1 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 4");
			Parent4 p = new Child4();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 4");
		} finally {
			System.out.println("in finally bolck 4");
		}
	}
}
