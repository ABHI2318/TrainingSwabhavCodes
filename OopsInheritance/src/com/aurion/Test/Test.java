package com.aurion.Test;

import com.aurion.Inheritance.Base;
import com.aurion.Inheritance.Derived;


public class Test {
    public static void main(String[] args) {
        Base obj = new Base();
        obj.setX(4);
        System.out.println("Base x: " + obj.getX());
      ;
      
   Derived obj2=new Derived();
   obj2.setY(2);
   System.out.println(+obj2.getY());
      
    }
}
