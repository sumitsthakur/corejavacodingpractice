package com.codingpractice.exceptionhandling;


class MyCustomExcpetion extends Exception{

	private static final long serialVersionUID = 1L;
	
	String errorMessage; 
	String errorCode;
	
	public MyCustomExcpetion(String errorCode, String errorMessage) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	
	@Override
	public String toString() {
		return errorCode + " : "+errorMessage;
	}
	
}


public class CustomExcpetion {

	public static void main(String[] args) throws MyCustomExcpetion {
		
		int i =10;
		int j = 0;
		
		if(j==0) {
			throw new MyCustomExcpetion("ERR1","Value of i should not be zero");
		}
		System.out.println(i/j);

	}

}
