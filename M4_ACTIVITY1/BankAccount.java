package bpi.module4.activity1;

public class BankAccount {
	private static String name;
	
	public static String getAccountName(String accountNumber) {
		if (accountNumber == "ACC-001") {
			return "Juan Dela Cruz";
		} else if (accountNumber == "ACC-002") {
			return "Maria Santos";	
		} else {
			return null;
		}
	}
	
	public static void testCase(String accountNumber) {
		System.out.println("Looking up account: " + accountNumber);
		try {
			name = getAccountName(accountNumber);
			System.out.println("Äccount Holder: " + name.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println("Error: Account not found!");
		}
	}

}
