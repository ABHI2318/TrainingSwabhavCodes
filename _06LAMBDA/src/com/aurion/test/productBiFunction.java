package com.aurion.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class productBiFunction {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> mul=(a,b)->(a*b);
		System.out.println("the resukt is "+mul.apply(2,4));
		Function<Integer,Integer>div=(a)->(a/5);
		System.out.println("the result is "+div.apply(4));
		

	}

}
