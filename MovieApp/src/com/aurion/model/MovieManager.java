package com.aurion.model;
import com.aurion.exception.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private List<Movie> movies;
    private static final String filePath = "D:\\SWABHAV_TRAINING\\SWABHAV_TRAINING\\COREJAVA\\MovieApp\\src\\store"; 

    public MovieManager() {
        movies = new ArrayList<>();
        loadMovies();  
    }

    public void addMovie(Movie movie) throws MovieException {
    	for(Movie existingMovie : movies) {
    		if(existingMovie.getId()==movie.getId()) {
    			throw new MovieException("Movie with ID "+movie.getId()+" exists in the database");
    		}
    	}
    	
        if (movies.size() >= 5) {
            throw new MovieException("Cannot add more movies limit is only upto 5 movirs");
        }
        movies.add(movie);
        saveMovies();  
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Movie getMovieById(int id) throws MovieException {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        throw new MovieException("Movie with ID " + id + " not found.");
    }

    public void removeMovieById(int id) throws MovieException {
        Movie movie = getMovieById(id);
        movies.remove(movie);
        saveMovies(); 
    }

    public void deleteAllMovies() {
        movies.clear();
        saveMovies();  
    }

    private void loadMovies() {
        try (ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream(filePath))) {
            movies = (List<Movie>) objectinputstream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No saved movies found");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading movies: " + e.getMessage());
        }
    }

    private void saveMovies() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(movies);
        } catch (IOException e) {
            System.out.println("Error saving movies: " + e.getMessage());
        }
    }
}
