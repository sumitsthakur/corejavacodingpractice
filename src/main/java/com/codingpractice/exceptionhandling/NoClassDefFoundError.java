package com.codingpractice.exceptionhandling;

/**
 * 
 * - NoClassDefFoundError occurs when class was present during compile time
 * and program was compiled and linked successfully but class was not present during runtime.
 * - It is error which is derived from LinkageError. 
 * - Linkage error occurs when a class has some dependencies on another class and latter class changes after compilation of former class. 
 * - NoClassFoundError is the result of implicit loading of class because of calling a method or accessing a variable from that class. 
 * - This error is more difficult to debug and find the reason why this error occurred. 
 * - So in this case you should always check the classes which are dependent on this class.
 * 
 * @author sumitsthakur
 *
 */

class DependentClass{
	
	public void print() {
		System.out.println("print test");
	}
}
public class NoClassDefFoundError {

	public static void main(String[] args) {
		System.out.println(" hello from NoClassDefFoundError");
		  DependentClass test = new DependentClass(); // remove this class after compilation to get the error
		  test.print();
	}

}
