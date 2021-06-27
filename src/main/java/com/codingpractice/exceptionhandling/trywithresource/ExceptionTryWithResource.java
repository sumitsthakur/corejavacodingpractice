package com.codingpractice.exceptionhandling.trywithresource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * For closing resource in finally block we have new future introduced in Java7 i.e. try with resource
 * - Resources defined and initialized in try block
 * - No need to close resource in finally block
 * @author sumitsthakur
 *
 */
public class ExceptionTryWithResource {
	public static void main(String[] args) {

		try (Scanner test = new Scanner(new File("src/main/resources/test.txt"))) {
			while (test.hasNext()) {
				System.out.println(test.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
