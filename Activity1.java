
import java.util.Scanner;
public class Activity1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	
		System.out.print("What is your name?"); 
		String myName = input.nextLine(); 
		System.out.print("Hello,"  + myName + "!");
		input.close();
} 
}