package com.aurionpro.commandline;

public class TrapezoidArea {

    public static void main(String[] args) {
        // Get the lengths of the two bases and the height from command-line arguments
        double base1 = Integer.parseInt(args[0]);
        double base2 =Integer.parseInt(args[1]);
        double height = Integer.parseInt(args[2]);
        
        // Formula for calculating the area of a trapezoid
        double area = 0.5 * (base1 + base2) * height;
        
        // Output the result
        System.out.println("The area of the trapezoid is: " + area);
    }
}
