
import java.util.Scanner;
public class Activity4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	
		System.out.print("Enter your age?"); 
		int myAge = input.nextInt(); 
			
		if (myAge < 18){
			System.out.println("Minor");	
		
		} else if (myAge >= 60){
			System.out.println("Senior");
			
		} else {
			System.out.println("Adult");
		}
		
		
		
		input.close();
} 
}