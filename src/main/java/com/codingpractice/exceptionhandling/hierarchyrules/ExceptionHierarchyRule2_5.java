package com.codingpractice.exceptionhandling.hierarchyrules;

import java.io.FileNotFoundException;
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
class Parent2_5 {

	void callParent() throws FileNotFoundException{
		System.out.println("parent class method 2_5");
	}
}

class Child2_5 extends Parent2_5 {
	//compile time exception at this line
	void callParent() throws IOException {
		System.out.println("child class method 2_5");
	}
}

public class ExceptionHierarchyRule2_5 {

	public static void main(String[] args) throws IOException {

		try {
			System.out.println("in try bolck 2_5");
			Parent2_5 p = new Child2_5();
			p.callParent();
		} catch (Exception e) {
			System.out.println("in catch bolck 2_5");
		} finally {
			System.out.println("in finally bolck 2_5");
		}
	}
}
