package bpi.module4.activity2;

public class ATMSystem {
	double[] accounts = {10000, 15000, 20000};
	int index;
	double amount;
	double currentBalance;
	double newBalance;
	
	public void processWithdrawal(String accountIndex, String amountInput) {
		System.out.println("Account Index: " + accountIndex + " , " + "Amount: " + amountInput);
		try {
			index = Integer.parseInt(accountIndex);
			currentBalance = accounts[index];
			System.out.println("Current Balance: Php " + currentBalance);
			amount = Double.parseDouble(amountInput);
			System.out.println("Withdrawal: Php " + amount);
			
			if (amount > currentBalance) {
				System.out.println("Insufficient funds! Cannot Withdraw Php " + amount);
			} else {
				newBalance = currentBalance - amount;
				System.out.println("New Balance: Php " + newBalance);
				System.out.println("Withdrawal Successful!");
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid Input!");
			System.out.println("Please enter valid numbers.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Account Not found!");
			System.out.println("Invalid account index.");
		} catch (Exception e) {
			System.out.println("Transaction failed!");
		}
		
	}
	
	
	
}
