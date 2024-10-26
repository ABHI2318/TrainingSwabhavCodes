package com.aurion.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {
	String name;
	List<IComponent> components =new ArrayList<>();
	 
	public void addComponents(IComponent com) {
		components.add(com);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for(IComponent c:components) {
			c.showPrice();
		}
		
	}

	public Composite(String name) {
		super();
		this.name = name;
	}

}
