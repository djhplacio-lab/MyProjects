package bpi.module3.actvity3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M3Activity3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		
		//Create map of product.
		Map<String, Integer> productMap = new HashMap<>();
		productMap.put("Laptop", 50000);
		productMap.put("Monitor", 10000);
		productMap.put("Keyboard", 1000);
		productMap.put("Mouse", 500);
		productMap.put("Printer", 15000);
		
		
		do {
			displayMenu();
			System.out.println(">");
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			case 1: //Search a product
				searchProduct(productMap, scanner);
				break;
			
			case 2: //Add a product
				addProduct(productMap, scanner);
				break;
				
			case 3: //Print all products and prices
				printProducts(productMap, scanner);
				break;
				
			case 4: //Find cheapest product
				findCheapest(productMap, scanner);
				break;
			case 5: //Exit
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option!");
				break;
			}	
				
		} while (option !=5);
	}

	
	private static void displayMenu() {
		System.out.println("Select an option");
		System.out.println("1 - Search a product");
		System.out.println("2 - Add a prodct");
		System.out.println("3 - Print all products and prices");
		System.out.println("4 - Find the cheapest product");
		System.out.println("5 - Exit");
	}
	
	
	private static void searchProduct(Map<String, Integer> productMap, Scanner scanner) {
		System.out.println("Enter product name to search:");
		String product = scanner.nextLine();
		
		if (productMap.containsKey(product)) {
			System.out.println("Product Found! Price:" + productMap.get(product) );
		} else {
			System.out.println("Product not found!");
		}
		
	}
	
	private static void addProduct(Map<String, Integer> productMap, Scanner scanner) {
		System.out.println("Enter product name to add:");
		String product = scanner.nextLine();
		System.out.println("Enter price:");
		Integer price = scanner.nextInt();
		
		productMap.put(product, price);
	}
	
	private static void printProducts(Map<String, Integer> productMap, Scanner scanner) {
		System.out.println("All products and prices:");
		
		for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		System.out.println("Total products: " + productMap.size());
		
	
	}
	
	private static void findCheapest(Map<String, Integer> productMap, Scanner scanner) {
		int cheapestPrice = Integer.MAX_VALUE;
		String cheapestProduct = "";
		
		for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
			if (entry.getValue() < cheapestPrice) {
				cheapestPrice = entry.getValue();
				cheapestProduct = entry.getKey();
			}
		
		}
		System.out.println("Cheapest product: " + cheapestProduct + " - " + cheapestPrice);
	}
	
}
