package com.java8.features;

public class B implements IBProxy{
	public A a;

    public B()
    {
        a= new A(this);
        System.out.println("Creating B");
    }
}
