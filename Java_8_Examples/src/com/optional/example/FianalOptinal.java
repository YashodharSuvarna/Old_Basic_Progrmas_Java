package com.optional.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FianalOptinal {

	public static void main(String[] args) {
		
		//Senario 1
		List<String> listOfStrings = Arrays.asList("Mark", "Howard", "Anthony D'Cornian");
		ArrayList<Integer> len = new ArrayList<>();
		for (int i = 0; i < 5; i++)	{
		System.out.println("data "+i);
		}
		Optional<String> largeString = listOfStrings.stream().filter(str -> str.length() > 3).findAny();
		largeString.ifPresent(System.out::println);

		Optional<String> veryLargeString = listOfStrings.stream().filter(str -> str.length() > 20).findAny();
		veryLargeString.ifPresent(System.out::println);

		//Senario 2
		Address johnaddress = new Address("52/A, 22nd Street", "Mumbai", "India", 400001);

		Person john = new Person("John", Optional.of(johnaddress), 874731232);

		Person mac = new Person("Mac", Optional.empty(), 333299911);
		Person gautam = new Person("Gautam", Optional.empty(), 533299911);

		List<Person> people = new ArrayList<>();
		people.add(john);
		people.add(mac);
		people.add(gautam);

		people.stream().forEach((p) -> {
			System.out.printf("%s from %s %n", p.name(), p.address().orElse(Address.EMPTY_ADDRESS));
		});
	}
}
