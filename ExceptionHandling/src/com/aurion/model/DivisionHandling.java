package com.aurion.model;

public class DivisionHandling {

	public static void main(String[] args) {

		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			double result = num1 / num2;
			System.out.println("the result is : " + result);

		} catch (ArithmeticException exception) {
			System.out.println("wrong inputs: number 2 cannot be zero");
		}

		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Invalid inputs please provide 2 numbers");
		} catch (NumberFormatException exception) {
			System.out.println("wrong inputs type:Only integer is allowed");
		}

		catch (Exception exception) {
			System.out.println("something went wrong");
		}
	}
}