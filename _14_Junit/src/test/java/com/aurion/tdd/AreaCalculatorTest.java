package com.aurion.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {

	
	private AreaCalculator calculator;
	@BeforeEach
	void init() {
		calculator=new AreaCalculator();
	}
	@Test
	void calculateAreaofCircle() {
		assertEquals(314,calculator.calculateAreaofCircle(10));
	}
	@Test
	void calculateAreaofSquare() {
		assertEquals(25,calculator.calculateAreaofSquare(5));
	}
	@Test
	void calculateAreaofTriangle() {
		assertEquals(100,calculator.calculateAreaofTriangle(10,20));
	}
	
	
}
