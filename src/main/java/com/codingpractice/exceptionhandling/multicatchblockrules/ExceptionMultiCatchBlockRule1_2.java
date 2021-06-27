package com.codingpractice.exceptionhandling.multicatchblockrules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Rule 1 : While using multi catch block
 * Declare as many excpetions you want but 
 * If base class exception is declared you can't declare child class excpetion
 * excpetion object is final
 * 
 * @author sumitsthakur
 *
 */
public class ExceptionMultiCatchBlockRule1_2 {

	public static void main(String[] args) {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
			FileReader file = new FileReader("somefile.txt");
		} catch (FileNotFoundException | IOException e) { // compile time exception
			System.out.println(e.getMessage());
		}

	}

}
