package com.consumer.example;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String name;
	String Hero;

	public Movie(String name, String hero) {
		super();
		this.name = name;
		Hero = hero;
	}
}

public class ConsumerEx2 {
	public static void main(String[] args) {
		ArrayList<Movie> data = new ArrayList<Movie>();
		populate(data);
		Consumer<Movie> a = d -> {
			System.out.println("Movie name" + d.name);
			System.out.println("Movie name" + d.Hero);
			
		};
		
		for (Movie i : data) {
			a.accept(i);

		}

	}

	public static void populate(ArrayList<Movie> d) {
		d.add(new Movie("Bahubali", "Prabhas"));
		d.add(new Movie("Rayees", "Sharukh"));
		d.add(new Movie("Dangal", "Ameer"));
		d.add(new Movie("Sultan", "Salman"));
	}
}
