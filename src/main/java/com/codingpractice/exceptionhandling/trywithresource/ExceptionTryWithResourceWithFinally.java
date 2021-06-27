package com.codingpractice.exceptionhandling.trywithresource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * We can have finally block also with try with resource
 * @author sumitsthakur
 *
 */
public class ExceptionTryWithResourceWithFinally {
	public static void main(String[] args) {
		try (Scanner test = new Scanner(new File("src/main/resources/test.txt"))) {
			while (test.hasNext()) {
				System.out.println(test.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			System.out.println("finally block");
		}

	}

}
