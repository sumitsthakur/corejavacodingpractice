package com.codingpractice.exceptionhandling.trywithresource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Before Java 9, we only could use fresh variables inside a try-with-resources block.
 * But after Java 9, now we can use final or effectively final
 * (those whose value doesn change even it is not marked as final)
 * defined variables
 * @author sumitsthakur
 *
 */
public class TryWithResourceImprovement {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner test = new Scanner(new File("src/main/resources/test.txt"));
		try (test) {
			while (test.hasNext()) {
				System.out.println(test.nextLine());
			}
		}
	}

}
