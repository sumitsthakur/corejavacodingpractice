package com.codingpractice.exceptionhandling.multicatchblockrules;


/**
 * Rule 1 : While using multi catch block
 * Declare as many exceptions you want but 
 * If base class exception is declared you can't declare child class exception
 * exception object is final
 * 
 * @author sumitsthakur
 *
 */
public class ExceptionMultiCatchBlockRule1_1 {

	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
