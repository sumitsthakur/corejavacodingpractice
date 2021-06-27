package com.codingpractice.exceptionhandling;

/**
 * - ClassNotFoundException occurs when you try to load a class at runtime
 * using Class.forName() or loadClass() methods and requested classes are not found in classpath.
 * - This exception is a checked Exception.
 * - This exception also occurs when you have two class loaders
 * and if a ClassLoader tries to access a class which is loaded by another classloader in Java.
 * 
 * @author sumitsthakur
 *
 */
public class ClassNotFoundExcpetionDemo {

	public static void main(String[] args) {
		try 
        {
            Class.forName("TestException"); // this class is not present in classpath
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }

	}

}
