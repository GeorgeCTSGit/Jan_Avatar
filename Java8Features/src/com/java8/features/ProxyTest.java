package com.java8.features;

public class ProxyTest {
	 public static void main(String[] args) 
	 
	    {
		 System.out.println("start");
		  B b = new B();
		  System.out.println("stage1");
	      //  A a = new A(b);
		  System.out.println(b.getClass());
	        System.out.println("Finish");
	    }

}
