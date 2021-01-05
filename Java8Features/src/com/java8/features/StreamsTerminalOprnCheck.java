package com.java8.features;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsTerminalOprnCheck {
	
	private static long counter;
	  
	private static void wasCalled() {
		
	    counter++;
	    System.out.println("Inside wasCalled() method with count "+ counter);
	}
	
	public static void main(String[] args) {
		String[] arr = new String[]{"dabacus", "barbadoes", "acadbar"};
		List<String> list = new ArrayList<String>();
		for (String t : arr) { 
            // Add each element into the list 
            list.add(t); 
        } 
		counter = 0;
		System.out.println("processing stream");
		System.out.println("\n\n");
		System.out.println("Process0");
		Stream<String> stream = list.stream().filter(element -> {
		    wasCalled();
		    return element.contains("2");
		});
		
		System.out.println("\n\n");
		System.out.println("Process1");
		Optional<String> stream1 = list.stream().filter(element -> {			
		    wasCalled();
		    System.out.println("filter invoked "+ counter);
		    return element.contains("ba");
		}).map(x -> {
			System.out.println("Map invoked");
			return x.toUpperCase();			
		}).findFirst();
		
		System.out.println("\n\n");
		System.out.println("Process2");
		counter =0;
		Optional<String> stream2 = list.stream().filter(element -> {			
		    wasCalled();
		    System.out.println("filter invoked "+ element);
		    return element.contains("ba");
		}).sorted()
				.map(x -> {
			System.out.println("Map invoked");
			System.out.println(x);
			return x.toUpperCase();			
		}).findFirst();
		
		System.out.println("all done");
		
		//===============
		String s1="WINDHOEK";
		String s2="LINGUA";
		for(int i=s1.length()-1;i>=0;i--){
		System.out.println(s1.substring(0,i+1));
		}
		for(int j=0;j<=s2.length()-1;j++){
		System.out.println(s2.substring(0,j+1));
		}
		//=================
		
		//int i = 0,j = 0,a=15;
		/*for(i=1;i=1;j--)
		{
			 // create Formatter class object 
	        Formatter formatter = new Formatter(); 
	  
	        // Use Space format specifier 
	        formatter.format("%d", a); 
	        System.out.println(formatter);
		//System.out.println("%d",a);
		a--;
		}
		System.out.println("\n");*/
		
		int itrns = 5;
		int maxNum = 15;
		int printCnt = 0;
		
		for (; itrns >= 1; itrns--) {

			for (; printCnt < itrns; maxNum--) {

				System.out.print(maxNum + " ");

				printCnt++;
				maxNum = maxNum;
			}
			printCnt = 0;
			System.out.println("");
		}
	}

}
