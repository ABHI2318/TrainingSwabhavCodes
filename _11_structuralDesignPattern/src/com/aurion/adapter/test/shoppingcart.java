package com.aurion.adapter.test;

import com.aurion.adapter.model.Biscuit;
import com.aurion.adapter.model.HatAdapter;
import com.aurion.adapter.model.IItem;
import com.aurion.adapter.model.Chocolate;
import com.aurion.adapter.model.Hat;


public class shoppingcart {

	public static void main(String[] args) {
		IItem buscuit=new Biscuit("parleG", 300);
	System.out.println(buscuit.getName());
	IItem chocholate=new Chocolate("munch",30);
	System.out.println(chocholate.getName()+" "+chocholate.getPrice());
	
	
	
	System.out.println("total price "+(chocholate.getPrice()+buscuit.getPrice()));
	Hat hat=new Hat("virat", "puma", 36, 2);
	IItem hatadaptor1=new HatAdapter(hat);	
	System.out.println(hatadaptor1);
	System.out.println("total price "+(hatadaptor1.getPrice()));
	}

}
