
import java.util.Scanner;
public class Activity3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	
		System.out.println("Enter first number:");
		int firstNum =  input.nextInt();
		System.out.println("Enter second number:");	
		int secondNum = input.nextInt();

		
		int sum = firstNum + secondNum;
		int difference = firstNum - secondNum;
		int product = firstNum * secondNum;
		
		display("Sum", sum);
		display("Difference", difference);
		display("Product", product);

		input.close();
	} 
	
	public static void display(String operation, int value) {
			System.out.println(operation + ":" + value);
	}


}