package com.codingpractice.java8.optional;

import java.util.Optional;

public class OptionalValuePresence {

	public static void main(String[] args) {
		/*
		 * Optional ispresent method will check whether values is present or not for optional
		 */
		Optional<String> optional1 = Optional.of("java");
		if (optional1.isPresent()){  
			System.out.println("value is present");
		}
		
		/*
		 * Optional isempty method will check whether values is present or not for optional
		 * It is feature of Java 11
		 */
		Optional<String> optionalIsEmpty = Optional.empty();
		if (optionalIsEmpty.isEmpty()){  
			System.out.println("value is present");
		}

		/*
		 * Optional ifpresent we invoke consumer with value else do nothing
		 */
		
		Optional<String> optionalIfPresent = Optional.of("java");
		optionalIfPresent.ifPresent(s -> System.out.println(s.length()));

	}

}
