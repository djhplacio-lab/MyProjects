package bpi.project1;

import java.util.*;

public class StudentGrade {
	static String studentName = "";
	static String studentID = "";
	static int numOfSubjects = 0;
	static double grade = 0.0;
	static double average = 0.0;
	static String status = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char choice;
		double sum = 0.0;

		
		do {
			displayMenu();
			System.out.println("Enter choice:");
			choice = scanner.next().charAt(0);
			scanner.nextLine();
			
			switch(choice) {
				case 'A':
					System.out.println("Enter student name:");
					studentName = scanner.nextLine();
					System.out.println("Enter student ID:");
					studentID = scanner.nextLine();
					System.out.println("Enter number of subjects:");
					numOfSubjects = scanner.nextInt();
			
	
					for (int i=1;i <= numOfSubjects;i++){
						System.out.println("Enter grade for subject " + i + ":");
						double grade = scanner.nextDouble(); 
						sum = sum + grade;
					}
					
					break;
				case 'B':  // Compute Student Average
					//compute average
					average = sum / numOfSubjects;
					//get status
					status = getStatus(average);
					System.out.println("Average: " + average);	
					System.out.println("Status: " + status);	
					break;
				case 'C': // Display Student Info
					System.out.println("Student Name: " + studentName);
					System.out.println("Student ID: " + studentID);
					System.out.println("Average: " + average);
					System.out.println("Status: " + status);
					break;
				case 'D': //Exit
					System.out.println("Program ends...");
					break;
				default:
					System.out.println("Please enter a valid choice - A, B, C or D.");
					break;
		
			}
			
		} while (choice != 'D');
		
		
		scanner.close();

	}

	public static void displayMenu() {
		System.out.println("===== STUDENT GRADING SYSTEM =====");
		System.out.println("A - Add Student Information");
		System.out.println("B - Compute Student Average");
		System.out.println("C - Display Student Information");
		System.out.println("D - Exit");

	}
	
	public static String getStatus(double average) {
		if (average < 80) {
			status = "FAIL";
		} else {
			status = "PASS";
		}
		return status;
	}
}
