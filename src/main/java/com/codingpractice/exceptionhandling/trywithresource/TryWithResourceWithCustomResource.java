package com.codingpractice.exceptionhandling.trywithresource;


/**
 * Try with resource for user defined class we need to implement AutoCloseable interface.
 * If we have multiple resources for try with resource, then closing sequence is 
 *  - Resources that were defined/acquired first will be closed last
 * @author sumitsthakur
 *
 */
class AutoClose implements AutoCloseable {

	public void print() {
		System.out.println("print from AutoClose 1");
	}
	
	@Override
	public void close() {
		System.out.println("close from AutoClose 1 class");
	}
}

class AutoClose2 implements AutoCloseable {

	public void print() {
		System.out.println("print from AutoClose 2");
	}
	
	@Override
	public void close() {
		System.out.println("close from AutoClose 2 class");
	}
}


public class TryWithResourceWithCustomResource {
	
	public static void main(String[] args) {
		AutoClose test = new AutoClose();
		AutoClose2 test2 = new AutoClose2();
		try (test;test2) {
			System.out.println("hello from try");
			test.print();
			test2.print();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
