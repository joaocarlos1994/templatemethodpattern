package br.com.templatedmethodpattern.usecabeca.compareto;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(final String[] args) {
		
		final Duck[] ducks = {new Duck("Daffy", 8),
							  new Duck("Dewey", 2),
							  new Duck("Howard", 7),
							  new Duck("Louis", 2),
							  new Duck("Donald", 10),
							  new Duck("Huey", 2)};
		
		System.out.println("Before sorting: ");
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("\nAfter sorting: ");
		display(ducks);
		
	}
	
	public static void display(final Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
	
}
