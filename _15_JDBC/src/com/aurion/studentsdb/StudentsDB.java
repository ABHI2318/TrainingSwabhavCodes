package com.aurion.studentsdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentsDB {
    private Scanner scanner = new Scanner(System.in);
    private Connection connection = null;
    private Statement statement = null;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student24db", "root", "1234");
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void getStudents() {
        try {
            statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM students");
            System.out.println("rollnumber \t Name \t age \t percentage");
            while (resultset.next()) {
                System.out.printf("%d \t %s \t %d \t %.2f%n",
                    resultset.getInt(1),
                    resultset.getString(2),
                    resultset.getInt(3),
                    resultset.getDouble(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudent() {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO students VALUES (?, ?, ?, ?)");
            System.out.println("Enter the rollnumber: ");
            int rollnumber = scanner.nextInt();
            System.out.println("Enter the name: ");
            String name = scanner.next();
            System.out.println("Enter the age: ");
            int age = scanner.nextInt();
            System.out.println("Enter the percentage: ");
            double percentage = scanner.nextDouble();

            statement.setInt(1, rollnumber);
            statement.setString(2, name);
            statement.setInt(3, age);
            statement.setDouble(4, percentage);

            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDetails() {
        System.out.println("Enter Percentage to Update: ");
        Double percentageIncrease = scanner.nextDouble();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE students SET Percenatge = Percenatge + ?");
            statement.setDouble(1, percentageIncrease);
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteRecord() {
        System.out.println("Enter Roll No to Delete: ");
        int rollNo = scanner.nextInt();
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM students WHERE rollnumber = ?");
            statement.setInt(1, rollNo);
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
