package com.aurion.test;

import com.aurion.exception.*;

import java.util.Scanner;
import com.aurion.model.*;
import com.aurion.model.Movie;

public class MovieController {

	private MovieManager manager;

	public MovieController() {
		manager = new MovieManager();
	}

	public static void main(String[] args) {
		MovieController controller = new MovieController();
		controller.start();
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Movie Store Developed by: Abhishek Singh");
			System.out.println("1. Add new Movie");
			System.out.println("2. Display All Movies");
			System.out.println("3. Find Movie by ID");
			System.out.println("4. Remove Movie by ID");
			System.out.println("5. Clear All Movies");
			System.out.println("6. Exit");
			System.out.print("Please enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				if (manager.getMovies().size() >= 5) {
					System.out.println("Cannot add more movies, the limit is 5 movies.");
				} else {
					Movie newMovie = setMovieDetails(scanner);
					try {
						manager.addMovie(newMovie);
						System.out.println("Movie added successfully.");
					} catch (MovieException e) {
						System.out.println(e.getMessage());
					}
				}
				break;
			case 2:
				displayAllMovies();
				break;
			case 3:
				System.out.print("Enter Movie ID to search: ");
				int searchId = scanner.nextInt();
				try {
					Movie movie = manager.getMovieById(searchId);
					System.out.println("Movie Found: " + movie);
				} catch (MovieException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.print("Enter Movie ID to remove: ");
				int removeId = scanner.nextInt();
				try {
					manager.removeMovieById(removeId);
					System.out.println("Movie removed successfully.");
				} catch (MovieException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				manager.deleteAllMovies();
				System.out.println("All movies have been deleted.");
				break;
			case 6:
				System.out.println("Exiting the application.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private void displayAllMovies() {
		System.out.println("All Movies in the Store:");
		for (Movie movie : manager.getMovies()) {
			System.out.println(movie);
		}
	}

	private Movie setMovieDetails(Scanner scanner) {
		System.out.print("Enter Movie ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Movie Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Year of Release: ");
		int year = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Movie Genre: ");
		String genre = scanner.nextLine();

		return new Movie(id, name, year, genre);
	}
}
