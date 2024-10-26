package com.aurion.test;
import java.util.function.Consumer;

public class factorialConsumer {

	public static void main(String[] args) {
		Consumer<Integer>factorialConsumer=(number)->{
			int fact=1;
			for(int i=1;i<=number;i++)
				fact=fact*i;
			System.out.println(fact);
		};
		
		factorialConsumer.accept(5);
		
		

	}

}
