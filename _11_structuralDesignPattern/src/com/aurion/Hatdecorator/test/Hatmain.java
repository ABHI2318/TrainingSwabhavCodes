package com.aurion.Hatdecorator.test;

import com.aurion.Hatdecorator.model.GoldenHat;
import com.aurion.Hatdecorator.model.IHat;
import com.aurion.Hatdecorator.model.PremiumHat;
import com.aurion.Hatdecorator.model.RibbonedHat;
import com.aurion.Hatdecorator.model.StandardHat;

public class Hatmain {
    public static void main(String[] args) {
    	  IHat standardHat = new StandardHat();
          System.out.println("Standard Hat Details:");
          System.out.println("Name: " + standardHat.getName());
          System.out.println("Price: " + standardHat.getPrice());
          System.out.println("Description: " + standardHat.getDescription());
        
          
          IHat premiumHat = new PremiumHat();
          IHat goldenPremiumHat = new GoldenHat(premiumHat);
          System.out.println("Golden Premium Hat Details:");
          System.out.println("Name: " + goldenPremiumHat.getName());
          System.out.println("Price: " + goldenPremiumHat.getPrice());
          System.out.println("Description: " + goldenPremiumHat.getDescription());
      
          
          
          
    }
}
