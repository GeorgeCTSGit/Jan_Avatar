package com.java8.features;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class SampleVOMain {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		// TODO Auto-generated method stub
		
		SampleVO obj = new SampleVO();
		//obj.setSeg1();
		
		for (Method method : obj.getClass().getDeclaredMethods()) {
		    if (Modifier.isPublic(method.getModifiers())
		        && method.getParameterTypes().length == 0
		        && method.getReturnType() != void.class
		        && (method.getName().startsWith("get") || method.getName().startsWith("is"))
		    ) {
		    	System.out.println(method.getName());
		        Object value = method.invoke(obj);
		        if (value != null) {
		            System.out.println(method.getName() + "=" + value);
		        }
		    }
		}

	}

}
