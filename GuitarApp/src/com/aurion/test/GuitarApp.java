package com.aurion.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.aurion.model.GuitarSpec;
import com.aurion.model.Inventory;
import com.aurion.model.Builder;
import com.aurion.model.Guitar;
import com.aurion.model.Type;
import com.aurion.model.Wood;

public class GuitarApp {

	 public static void main(String[] args) {
		    
		    Inventory inventory = new Inventory();
		    initializeInventory(inventory);
              Scanner scanner=new Scanner(System.in);
              System.out.println("Enter Guitar choices");
             
              System.out.println("Select Builder:");
              Builder builder = selectOption(Builder.values(), scanner);

             
              System.out.println("Enter Model (e.g., Stratocastor, CJ):");
              String model = scanner.next().toUpperCase();

             
              System.out.println("Select Type:");
              Type type = selectOption(Type.values(), scanner);

              
              System.out.println("Enter number of strings (6 or 12):");
              int numStrings = scanner.nextInt();

             
              System.out.println("Select Back Wood:");
              Wood backWood = selectOption(Wood.values(), scanner);

              
              System.out.println("Select Top Wood:");
              Wood topWood = selectOption(Wood.values(), scanner);
              
              GuitarSpec userprefferd=new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
              List<GuitarSpec> matchingGuitars=inventory.search(userprefferd);
              
		    if (!matchingGuitars.isEmpty()) {
		      System.out.println("Abhishek you might like these guitars:");
		      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
		        Guitar guitar = (Guitar)i.next();
		        GuitarSpec spec = guitar.getSpec();
		        System.out.println("  We have a " +
		          spec.getBuilder() + " " + spec.getModel() + " " +
		          spec.getType() + " guitar:\n     " +
		          spec.getBackWood() + " back and sides,\n     " +
		          spec.getTopWood() + " top.\n  You can have it for only INR " +
		          guitar.getPrice() + "!\n  having Serail Number "+guitar.getSerialNumber() +"\n ");
		      }
		    } else {
		      System.out.println("Sorry, Abhishek , we have nothing matching for you according to your preferance But would Still recommened try this ");

		 	 GuitarSpec whatRickLikes = 
		 		      new GuitarSpec(Builder.FENDER, "Stratocastor", 
		 		                     Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
		 	 System.out.println(whatRickLikes);
		    }
		  }

	 
	 private static <Type> Type selectOption(Type[] options,Scanner scanner) {
		 for(int i=0;i<options.length;i++) {
			 System.out.println((i+1)+" ."+options[i]);
			 
		 }
		 int choice=scanner.nextInt();
		 while(choice<1 || choice>options.length) {
			 System.out.println("Invalid choice please select within range between 1 and  "+options.length);
			 choice=scanner.nextInt();
		 }
		return options[choice-1];
	 }


		  private static void initializeInventory(Inventory inventory) {
		    inventory.addGuitar("101", 3999, 
		      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
		                     Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		    inventory.addGuitar("102", 1499, 
		      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		    inventory.addGuitar("103", 1549, 
		      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		    inventory.addGuitar("104", 5499, 
		      new GuitarSpec(Builder.MARTIN, "CJ", Type.ACOUSTIC, 6,
		                     Wood.MAHOGANY, Wood.ADIRONDACK));
		    inventory.addGuitar("105", 6295, 
		      new GuitarSpec(Builder.MARTIN, "CJ", Type.ACOUSTIC, 6,
		                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		    inventory.addGuitar("106", 2295, 
		      new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		    inventory.addGuitar("107", 1890, 
		      new GuitarSpec(Builder.GIBSON, "CJ", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		    inventory.addGuitar("108", 6275, 
		      new GuitarSpec(Builder.MARTIN, "Stratocastor", Type.ACOUSTIC, 6,
		                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		    inventory.addGuitar("109", 12995, 
		      new GuitarSpec(Builder.OLSON, "CJ", Type.ACOUSTIC, 12,
		                     Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
		    inventory.addGuitar("110", 8999, 
		      new GuitarSpec(Builder.RYAN, "CJ", Type.ACOUSTIC, 12,
		                     Wood.COCOBOLO, Wood.CEDAR));
		    inventory.addGuitar("111", 2100, 
		      new GuitarSpec(Builder.PRS, "Stratocastor", Type.ELECTRIC, 
		                     6, Wood.MAHOGANY, Wood.MAPLE));
		    inventory.addGuitar("112", 13000,
		      new GuitarSpec(Builder.COLLINGS, "CJ",Type.ACOUSTIC , 12, Wood.CEDAR, Wood.ALDER));
		  }
		}