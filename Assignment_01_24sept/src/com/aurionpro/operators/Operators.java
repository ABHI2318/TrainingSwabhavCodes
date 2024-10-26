package com.aurionpro.operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulo

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int c = +a; // Positive
        System.out.println("c = +a -> " + c);
        c = -a; // Negative
        System.out.println("c = -a -> " + c);
        System.out.println("a++ = " + (a++)); // Post-increment
        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("a-- = " + (a--)); // Post-decrement
        System.out.println("--a = " + (--a)); // Pre-decrement
        boolean bool = true;
        System.out.println("!bool = " + (!bool)); // Logical NOT

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        a = 10;
        System.out.println("a = " + a);
        a += 5; // a = a + 5
        System.out.println("a += 5 -> " + a);
        a -= 3; // a = a - 3
        System.out.println("a -= 3 -> " + a);
        a *= 2; // a = a * 2
        System.out.println("a *= 2 -> " + a);
        a /= 2; // a = a / 2
        System.out.println("a /= 2 -> " + a);
        a %= 3; // a = a % 3
        System.out.println("a %= 3 -> " + a);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b -> " + (a == b)); // Equal to
        System.out.println("a != b -> " + (a != b)); // Not equal to
        System.out.println("a > b -> " + (a > b)); // Greater than
        System.out.println("a < b -> " + (a < b)); // Less than
        System.out.println("a >= b -> " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b -> " + (a <= b)); // Less than or equal to

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > 5 && b < 30) -> " + ((a > 5) && (b < 30))); // Logical AND
        System.out.println("(a > 5 || b < 15) -> " + ((a > 5) || (b < 15))); // Logical OR
        System.out.println("!(a > 5) -> " + !(a > 5)); // Logical NOT

        // Bitwise Operators
        int x = 5, y = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("x & y = " + (x & y)); // Bitwise AND
        System.out.println("x | y = " + (x | y)); // Bitwise OR
        System.out.println("x ^ y = " + (x ^ y)); // Bitwise XOR
        System.out.println("~x = " + (~x)); // Bitwise Complement
       

   
    }
	}


