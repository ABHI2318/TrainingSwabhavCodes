package com.aurion.model;


import java.io.Serializable;

public class Movie implements Serializable {
    private int id;
    private String name;
    private int year;
    private String genre;

    public Movie(int id, String name, int year, String genre) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Movie ID: " + id + ", Name: " + name + ", Year: " + year + ", Genre: " + genre;
    }
}
