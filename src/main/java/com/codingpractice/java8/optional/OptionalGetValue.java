package com.codingpractice.java8.optional;

import java.util.Optional;

public class OptionalGetValue {

	public static void main(String[] args) {
		
		/*
		 * to get the value from optional.
		 * If value is not present it will throw NoSuchElementException
		 */
		Optional<String> optional1 = Optional.of("java");
		if (optional1.isPresent()){ 
		  String value = optional1.get();
		}
		
		 /*
		  *  It will return the value of optional if present 
		  *  else return the default value which we pass as argument
		  */
        String nullName = null;
        String nameOrElse = Optional.ofNullable(nullName).orElse("default");
        
      /*
       * It will return value if present else 
       * invoke the supplier 
       */
        String nameOrElseGet = Optional.ofNullable(nullName).orElseGet(() -> "john");
	}

}
