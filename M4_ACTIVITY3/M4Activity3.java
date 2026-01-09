package bpi.module4.activity3;


public class M4Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMTransaction atmTransaction = new ATMTransaction();
		System.out.println("=== ATM Balance Inquiry System ===");
		System.out.println("--- Test Case 1: Valid Savings Account ---");
		atmTransaction.checkBalance("100123456", 15000.00);
		System.out.println("--- Test Case 2: Valid Checking Account ---");
		atmTransaction.checkBalance("200987654", 25000.00);
		System.out.println("--- Test Case 3: Invalid Account Number Format ---");
		atmTransaction.checkBalance("ABC12345", 15000.00);
		System.out.println("--- Test Case 4: Empty Account Number ---");
		atmTransaction.checkBalance("", 15000.00);

	}

}
