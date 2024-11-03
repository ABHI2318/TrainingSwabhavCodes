package com.aurion.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticoperationsTest {
	private Arithmeticoperations operations;
	
	@BeforeEach
	void init() {
		operations=new Arithmeticoperations();
	}
	@AfterAll
   static void acknowledge() {
	   System.out.println("after all test done");
   }
	@Test
	void testAddition() {
	Arithmeticoperations operations=new Arithmeticoperations();
	int actual=operations.addition(4, 5);
	assertEquals(9, actual);
	assertTrue(actual>=9);
	
	
	}

	@Test
	void testdivision() {
		Arithmeticoperations operations=new Arithmeticoperations();
		assertEquals(1, operations.division(4,4),"expected output is substraction");
		
//		assertThrows();
	assertThrows(ArithmeticException.class, () ->  operations.division(10,0));
		
           
	
	}
	
	@Test
	void testSubstraction() {
		Arithmeticoperations operations=new Arithmeticoperations();
		assertEquals(3, operations.substraction(7,4),"expected output is substraction");
		assertTrue(operations.substraction(7,4)>2);
	}
	@Test
	void testmultiplication() {
		Arithmeticoperations operations=new Arithmeticoperations();
		assertEquals(28, operations.multiplication(7,4),"expected output is substraction");
		assertTrue(operations.multiplication(7,4)>2);
	}
     
	
}
