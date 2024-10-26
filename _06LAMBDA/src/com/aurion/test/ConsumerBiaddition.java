package com.aurion.test;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class ConsumerBiaddition {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer>addition=(num1,num2)->{
			System.out.println("biconsumer addition is "+(num1+num2));
		};
		
		addition.accept(3,4);
		//SUPPLIER WILL RETURN ONLY ONE VALUE 
		Supplier<Integer> randomnumbersupply=()->(new Random()).nextInt();
		System.out.println( randomnumbersupply.get());
		
		//predicate to check prime
		Predicate<Integer> evenPredicate=(number)->{
			if(number%2==0)
				return true;
			return false;
		};
		
		System.out.println(evenPredicate.test(3));
		
		BiPredicate<Integer,Integer>MaxNum=(num1,num2)->{
		  if(num1>num2)
			  return true;
		  return false;
		  
		};
		System.out.println(MaxNum.test(2,4));
    
	}

}
