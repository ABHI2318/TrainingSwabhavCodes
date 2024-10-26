package com.aurion.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.aurion.model.*;
import com.aurion.model.Task;

public class Executer {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	   int processor=Runtime.getRuntime().availableProcessors();
	   System.out.println(processor);
//		ExecutorService service=Executors.newFixedThreadPool(1);
//		
//		 for(int i=0;i<10;i++) {
//			 service.execute(new Task());
//		 }
//		 for(int i=0;i<10;i++) {
//			 Future<Integer> future=service.submit(new RandomNumberGenerator());
//			 System.out.println(future.get());
//		 }
//		 
		 List<RandomNumberGenerator> generators=new ArrayList<>();
		 generators.add(new RandomNumberGenerator());
		 generators.add(new RandomNumberGenerator());
		 generators.add(new RandomNumberGenerator());
		 generators.add(new RandomNumberGenerator());
		 generators.add(new RandomNumberGenerator());
		 
		 ExecutorService service=Executors.newCachedThreadPool();
		 List<Future<Integer>> futures=service.invokeAll(generators);
		 
		 for(Future future:futures)
			 System.out.println(future.get());
		 
		 System.out.println("-------------------");
		 System.out.println(service.invokeAny(generators));
		  
		 
		 
		 service.shutdown();
		
			}
	

}
