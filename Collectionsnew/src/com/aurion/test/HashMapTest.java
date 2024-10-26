package com.aurion.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> students=new HashMap<>();
		students.put(2, "abhisehk");
		students.put(3, "mood");
		students.put(4, "ayush");
		students.put(5, "rahul");
		
		
		System.out.println(students);
		
	Set<Map.Entry<Integer, String>> studentsSet=students.entrySet();
		for(Map.Entry<Integer, String> stu:studentsSet)
	{
			System.out.println(stu.getKey()+" "+stu.getValue());
			}
	}

}
