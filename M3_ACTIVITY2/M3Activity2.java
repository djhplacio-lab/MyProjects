package bpi.module3.activity2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class M3Activity2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		
		HashSet<String> productSet = new HashSet<String>();
		productSet.add("LAPTOP");	
		productSet.add("KEYBOARD");
		productSet.add("MONITOR");
		productSet.add("MOUSE");
		productSet.add("PRINTER");

		do {
			displayMenu();
			System.out.println(">");
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
				case 1: //Search a product
					searchProduct(productSet, scanner);
					break;
				
				case 2: //Add a product
					addProduct(productSet, scanner);
					break;
					
				case 3: //Print all products and count
					printProducts(productSet, scanner);
					break;
					
				case 4: //Exit
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid option!");
					break;
			}	
			
		} while (option != 4);
		
		
		
	}
	
	private static void displayMenu() {
		System.out.println("Select an option");
		System.out.println("1 - Search a product");
		System.out.println("2 - Add a prodct");
		System.out.println("3 - Print all products and count");
		System.out.println("4 - Exit");
	}
	
	private static void searchProduct(Set<String> productSet, Scanner scanner) {
		System.out.println("Enter product name to search:");
		String product = scanner.nextLine();
		
		if (productSet.contains(product.toUpperCase())) {
			System.out.println("Product Found: " + product);
		} else {
			System.out.println("Product not found!");
		}
		
	}
	
	private static void addProduct(Set<String> productSet, Scanner scanner) {
		System.out.println("Enter product name to add:");
		String product = scanner.nextLine();
		
		if (productSet.add(product.toUpperCase())) {
			System.out.println("Product added: " + product);
		} else {
			System.out.println("Product already exists: " + product);
		}
	}
	
	private static void printProducts(Set<String> productSet, Scanner scanner) {
		System.out.println("All products:");
		
		for (String product : productSet) {
			System.out.println(product);
		}
		
		System.out.println("Total unique products: " + productSet.size());
	
	}

}
