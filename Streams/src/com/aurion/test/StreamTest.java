package com.aurion.test;

import java.text.Collator; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.Stream; 
 
public class StreamTest { 
 
 public static void main(String[] args) { 
   System.out.println("hello");
  List<Integer> numbers = Arrays.asList(22,33,44,55); 
          
  Stream<Integer> numberStream=numbers.stream(); 
   
  numberStream.forEach((number)->System.out.println(number*number)); 
  // numbers.stream().filter((number)->(number%2!=0)).forEach((number)->System.out.println(number)); 
   
  List<Integer> oddnumber = numbers.stream().filter((number)->(number%2!=0)).collect(Collectors.toList()); 
   
  oddnumber.stream().forEach((number)->System.out.println(number)); 
  
  numbers.stream()
  .map((number)->number*number)
  .filter((number)->(number>500))
  .forEach((number)->System.out.println(number));
  
  
  int res= numbers.stream()
                   .reduce(0, (sum,number)->(sum+number));
  System.out.println(res); // Output: 15
  
  
 }
}

