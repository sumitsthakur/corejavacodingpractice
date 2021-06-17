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
class Parent6 {

	void callParent() throws Exception{
		System.out.println("parent class method 6");
	}
}

class Child6 extends Parent6 {
	void callParent() throws ArithmeticException {
		System.out.println("child class method 6");
	}
}

public class ExceptionHierarchyRule2_3 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 6");
			Parent6 p = new Child6();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 6");
		} finally {
			System.out.println("in finally bolck 6");
		}
	}
}
