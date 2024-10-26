package com.aurion.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAssignment1 {

	public static void main(String[] args) {
		String[] name= {"Jayesh","Nimesh","Mark","Mahesh","Ramesh"};
		
		List<String> names=Arrays.stream(name)
				.limit(3)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(names);//ascending q1
		
		List<String> names2=Arrays.stream(name)
				.filter(name2->name2.toLowerCase().contains("a"))
				.limit(3)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(names2);//ascending contains a q2
		
		List<String> namesList = Arrays.asList(name);
		  Collections.sort(namesList, Comparator.reverseOrder());
		  System.out.println(namesList);//descending  q3
		  
			
		
		
		
    

	}

}
