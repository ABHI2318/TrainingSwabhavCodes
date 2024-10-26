package com.aurion.model;

public class BookModel {
  private int book_id;
  private String name;
  private String author;
  private int price;
  
 
public BookModel(int book_id, String name, String author, int price) {
	this.book_id = book_id;
	this.name = name;
	this.author = author;
	this.price = price;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public void display() {
	System.out.println("Book_id: "+this.book_id);
	System.out.println("Name: "+this.name);
	System.out.println("Author: "+this.author);
	System.out.println("Price "+this.price);
}
}
