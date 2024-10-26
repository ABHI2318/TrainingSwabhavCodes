package com.aurionpro.treasure;

import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) {
        // rider checking with age
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the Height in cms: ");
        int height = scanner.nextInt();

        if (height > 120) {
            System.out.println("Yes, you can ride!");

            // check age
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            int billing = 0;

            if (age < 12) {
                billing = 5;
                System.out.println("The bill for a child is $" + billing);
            } else if (age >= 12 && age <= 18) {
                billing = 7;
                System.out.println("The bill is $" + billing);
            } else if (age >= 45 && age <= 55) {
                billing = 0;
                System.out.println("The price is $" + billing);
            } else {
                billing = 12;
                System.out.println("The bill for adults over 18 is $" + billing);
            }

            // Asking for photos
            System.out.println("Do you want photos? (yes/no)");
            String wantPics = scanner.next().toLowerCase();

            if (wantPics.equals("yes")) {
                if (age < 12) {
                    billing += 5;
                } else if (age >= 12 && age <= 18) {
                    billing += 7;
                } else if (age >= 18 && age < 45) {
                    billing += 12;
                } else if (age >= 45 && age <= 55) {
                    billing += 3;
                }

                System.out.println("The total price is $" + billing);
            } else {
                System.out.println("The total price is $" + billing);
            }

        } else {
            System.out.println("Sorry, you cannot ride. Minimum height is 120 cm.");
        }
    }
}
