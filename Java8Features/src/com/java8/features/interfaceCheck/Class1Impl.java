package com.java8.features.interfaceCheck;

public class Class1Impl implements IClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1Impl obj = new Class1Impl();
		System.out.println("square is : "+obj.getSquare(4));
		obj.defMethod();
		IClass1.stMethod();
		Class1Impl.stMethod();

	}
	
	//static method in interface cannot be overridden
	public static void stMethod() {
		System.out.println("my st class");
	}
	
	//trying to override default method
	@Override
	public void defMethod() {
		System.out.println("in my class");
	}

	@Override
	public int getSquare(int a) {
		// TODO Auto-generated method stub
		
		return a*a;
	}

}
