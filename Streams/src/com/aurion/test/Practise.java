package com.aurion.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {

	public static void main(String[] args) {
//		String [] array= {"apple","banana","orange","pineapple","lemon"};
//		Stream<String> stream=Arrays.stream(array);
//	     Stream<Integer> Iterating=Stream.iterate(0,n->n+1).limit(100);
//	     Stream<String>genearting=Stream.generate(()->"hello").limit(5);
		
		List<Integer>list=Arrays.asList(23,34,3,43,2,0,24,2,34,43,21,32,0,1);
	List<Integer> newlist=	list.stream()
			.filter(n->n%2==0)
			.map(n->n/2)
			.peek(a->System.out.println(a))
			.distinct()
			.sorted((a,b)->(b-a))
			.collect(Collectors.toList());
	System.out.println(newlist);
//	List<Integer> mappedlist=newlist.stream().map(n->n/2).collect(Collectors.toList());
//	System.out.println(mappedlist);
	}

}
