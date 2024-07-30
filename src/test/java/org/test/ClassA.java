package org.test;

public class ClassA {
	
	private void test1() {
		System.out.println("test1");
	}
	private void test2() {
		System.out.println("test2");
	}
	private void test3() {
		System.out.println("test3");
	}
	
	public static void main(String[] args) {
		ClassA c = new ClassA();
		c.test1();
		c.test2();
		c.test3();
	}
}
