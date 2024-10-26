package com.aurion.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringnameTest {

	public static void main(String[] args) {
		String[] names= {"Jayesh","Nimesh","Mark","Mahesh","Ramesh"};
		   String[] firstThreeSorted = Arrays.stream(names)
                   .limit(3)
                   .sorted()
                   .toArray(String[]::new);
System.out.println("First 3 students sorted in ascending order: " + Arrays.toString(firstThreeSorted));//asceding sorted

String[] firstThreeWithA = Arrays.stream(names)
.limit(3)
.filter(name -> name.toLowerCase().contains("a"))
.sorted()
.toArray(String[]::new);
System.out.println("First 3 students with 'a' sorted in ascending order: " + Arrays.toString(firstThreeWithA));//sorted contains 
	  }

	}


