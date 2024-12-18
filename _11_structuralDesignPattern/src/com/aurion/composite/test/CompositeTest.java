package com.aurion.composite.test;

import com.aurion.composite.model.Composite;
import com.aurion.composite.model.IComponent;
import com.aurion.composite.model.Leaf;

public class CompositeTest {

	public static void main(String[] args) {
		IComponent hardrive=new Leaf(3000, "harddrive");
		IComponent mouse=new Leaf(300, "mouse");
		IComponent monitor=new Leaf(12000, "monnitor");
		IComponent  keyboard=new Leaf(2320, "keyboard");
		IComponent Ram=new Leaf(8000, "RAM");
		IComponent cpu=new Leaf(40000, "cpu");
		
		Composite	ph=new Composite("peripehral:");
		Composite	 motherboard=new Composite("motheboard");
		Composite	 cabinet=new Composite("cabinet: ");
		Composite computer=new Composite("computer");
		
		motherboard.addComponents(Ram);
		motherboard.addComponents(mouse);
		ph.addComponents(mouse);
		ph.addComponents(monitor);
		cabinet.addComponents(hardrive);
		cabinet.addComponents(motherboard);
		computer.addComponents(cabinet);
		computer.addComponents(ph);
		
		//ph.showPrice();
		//cabinet.showPrice();
		computer.showPrice();
		
		
		

	}

}
