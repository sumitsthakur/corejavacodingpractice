package com.codingpractice.exceptionhandling.multicatchblockrules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Rule 1 : While using multi catch block
 * Declare as many excpetions you want but 
 * If base class exception is declared you can't declare child class excpetion
 * excpetion object is final
 * 
 * @author sumitsthakur
 *
 */
public class ExceptionMultiCatchBlockRule1_3 {

	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e = NumberFormatException(); // compile time exception, not allowed as compiler is not sure which exception is catching
			System.out.println(e.getMessage());
		}

	}

}
