package com.aurion.ArrayList;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(34);
		list.add(90);
		list.add(23);
		list.add(2,34);
		System.out.println(list);
		list.set(2,3333);
		System.out.println(list);
	}

}
