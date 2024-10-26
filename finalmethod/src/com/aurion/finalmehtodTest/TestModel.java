package com.aurion.finalmehtodTest;

import com.aurion.finalmethodmodel.modelA;
import com.aurion.finalmethodmodel.modelB;
import com.aurion.finalmethodmodel.modelC;

public class TestModel {

	public static void main(String[] args) {
		modelA objA=new modelA();
		objA.method();
		
		modelB objB=new modelB();
		objB.method();
		
		objA=objB; //superclass reference can refer to subclass
	    ((modelB)objA).method1();//but superclass reference can access only those contents which are inherited
		objA.method();//runtime polymorphism
		
		objA=new modelC();
		objA.method();

	}

}
