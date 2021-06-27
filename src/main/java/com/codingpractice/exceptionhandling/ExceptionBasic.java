package com.codingpractice.exceptionhandling;

import java.io.IOException;

public class ExceptionBasic {
	
	// throws will tell calling method to handle the checked exception
	public static void main(String[] args) throws IOException {
		
		//to make code exception safe
		try {
			System.out.println("in try bolck");
			int a=5;
			System.out.println(a);
			int b= a/0;
			System.out.println(b);
		
			// catch block will catch the exception
		}catch(ArithmeticException e){
			e = new ArithmeticException();
			System.out.println("in catch bolck");
			//finally will always execute
		}finally {
			System.out.println("in finally bolck");
		}
	}

}
