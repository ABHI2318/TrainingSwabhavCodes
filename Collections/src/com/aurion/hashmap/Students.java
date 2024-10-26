package com.aurion.hashmap;

import java.util.HashMap;
import java.util.*;

public class Students {

	public static void main(String[] args) {
		HashMap<String,Integer> mapping= new HashMap<>();
		 mapping.put("abhishek",23);
		 mapping.put("virat",45);
		 mapping.put("rohit", 0);
		 System.out.println(mapping);
//		 mapping.remove("virat",45);
//		 System.out.println(mapping);
//		 mapping.replace("rohit", 0, 55);
//		 System.out.println(mapping);
		 System.out.println("Enter the student's name to display their marks:");
		 Scanner scanner=new Scanner(System.in);
	        String name = scanner.nextLine();
	        if (mapping.containsKey(name)) {
	            System.out.println(name + " " + mapping.get(name));
	        } else {
	            System.out.println("Student not found in the record.");
	        }
			 
	        System.out.println("remove the students record: ");
	        String name1=scanner.nextLine();
	        if(mapping.containsKey(name1)) {
	        	System.out.println(name1+"removed"+mapping.remove(name1) );
	        	
	        }
	        else {
	        	System.out.println("records not found cannot remove");
	        }
	        System.out.println(mapping);

	}

}
