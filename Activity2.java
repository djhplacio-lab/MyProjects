
import java.util.Scanner;
public class Activity2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	
		System.out.print("Enter your age?"); 
		String myAge = input.nextLine(); 
		int intAge = Integer.parseInt(myAge);
		double doubleAge = Double.parseDouble(myAge);
		System.out.println("Your age as int: " + intAge);
		System.out.println("Your age as double: " + doubleAge);
		input.close();
} 
}