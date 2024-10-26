package com.aurion.TestInheritance;

import com.aurion.ModelInheritance.Calc;

public class calculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj=new Calc();
		int c1=obj.add(4, 5);
		System.out.println(c1);
		
		Calc obj2=new Calc();
		int c2=obj.sub(4, 5);
		System.out.println(c2);
		
		Calc obj3=new Calc();
		double c3=obj.multi(4, 5);
		System.out.println(c3);
		
		Calc obj4=new Calc();
		double c4=obj.div(4, 5);
		System.out.println(c4);

	}

}
