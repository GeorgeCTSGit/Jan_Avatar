package com.java8.features.interfaceCheck;

@FunctionalInterface
public interface IClass1 {
	
	public int getSquare(int a);
	
	
	
	//default method can be overridden
	default void defMethod() {
		System.out.println("default");
	}
	
	//cannot override in impl class
	static void stMethod() {
		System.out.println("static");
	}

}
