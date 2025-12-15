package bpi.module3.activity1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3Activty1 {

	public static void main(String[] args) {
		//create List of Products with 5 records
		List<String> products = new ArrayList<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		//print all products
		System.out.println("All products:");
		
		for (int i = 0; i < products.size(); i++) {
			System.out.println((i+1) + ". " + products.get(i));
		}
		
		//add Webcam
		products.add("Webcam");
		
		//remove Mouse
		products.remove("Mouse");
		
		//print updated list
		System.out.println("\n");
		System.out.println("After addng and remoning products:");
		for (int i = 0; i < products.size(); i++) {
			System.out.println((i+1) + ". " + products.get(i));
		}
		
		//find a product
		System.out.println("\n");
		System.out.println("Enter a product name to search:");
		Scanner scanner = new Scanner(System.in);
		String productName = scanner.nextLine(); 
		
		if (products.contains(productName)) {
			System.out.println("Product found:" + productName);
		} else {
			System.out.println("Product not found.");
		}
		
	}

}
