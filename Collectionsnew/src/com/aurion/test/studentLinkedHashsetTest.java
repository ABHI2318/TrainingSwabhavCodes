package com.aurion.test;
import java.util.LinkedHashSet;
import java.util.Scanner;
import com.aurion.model.studentLinkedHashsetModel; 

public class studentLinkedHashsetTest {

    public static void main(String[] args) {
       
        LinkedHashSet<studentLinkedHashsetModel> students = new LinkedHashSet<studentLinkedHashsetModel>(); 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int num = scanner.nextInt();
        scanner.nextLine();  
        
        for (int i = 0; i < num; i++) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.println("Enter your roll number: ");
            int rollnumber = scanner.nextInt();
            
            System.out.println("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine();  
            
       
            students.add(new studentLinkedHashsetModel(name, rollnumber, percentage)); 
            
         
            for (studentLinkedHashsetModel stud : students) {
                System.out.println(stud);
            }
        }

        scanner.close();
    }
}
