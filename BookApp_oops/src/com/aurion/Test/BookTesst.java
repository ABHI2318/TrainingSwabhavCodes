package com.aurion.Test;

import java.util.Scanner;
import com.aurion.model.BookModel;

public class BookTesst {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int number = scanner.nextInt();
        BookModel[] books = new BookModel[number];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the book_id: ");
            int id = scanner.nextInt();
            System.out.println("Enter the book name: ");
            String name = scanner.next();
            System.out.println("Enter the author name: ");
            String author = scanner.next();
            System.out.println("Enter the price: ");
            int price = scanner.nextInt();

            books[i] = new BookModel(id, name, author, price);
        }

        int n = number;
        BookModel temp = null;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (books[j - 1].getPrice() < books[j].getPrice()) {  
                    
                    temp = books[j - 1];
                    books[j - 1] = books[j];
                    books[j] = temp;
                }
            }
        }

       
        System.out.println("Book with highest price:");
        books[0].display();  

        System.out.println();
        System.out.println("Books in descending order :");
        for (int i = 0; i < number; i++) {
            books[i].display();  
            System.out.println();
        }

        scanner.close();
    }
}
