package br.com.templatedmethodpattern.usecabeca.hook;

public class BeverageTestDrive {

	public static void main(String[] args) {
		
		final CaffeineBeverageWithHook coffeeWithHook = new CoffeeWithHook();
		
		System.out.println("\nMaking coffee...");
		coffeeWithHook.prepareRecipe();
	}

}
