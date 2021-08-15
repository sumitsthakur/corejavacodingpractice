package com.codingpractice.java8.optional;

import java.util.Optional;

public class OptionalCreate {

	public static void main(String[] args) {
		
		/*
		 *  Creating an empty optional
		 *  Dont compare this object with == operator
		 */
		Optional<String> empty = Optional.empty();
		
		/*
		 * Creating an optional using of method
		 * It is for non null argument, if the argument is null it will throw NPE
		 */
		
		String name = "java";
		Optional<String> opt = Optional.of(name);
		
		
		/*
		 *  Creating an optional using ofNullable method	
		 *  If argument is null it will creaty empty optional
		 */
		Optional<String> optional = Optional.ofNullable(name);
	}

}
