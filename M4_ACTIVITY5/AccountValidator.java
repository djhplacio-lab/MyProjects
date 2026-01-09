package bpi.module4.activity5;

public class AccountValidator {
	
	public static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
		//check for null
		if (accountNumber == null) {
			throw new NullPointerException("Warning: Account number cannot be null");
		}
		//check format
		for (char c: accountNumber.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new InvalidAccountFormatException("Warning: Account number must contain only digits");
			}
		}
		
		//check length
		if (accountNumber.length() != 10) {
			throw new InvalidAccountNumberException("Error: Account number must be exactly 10 digits");
		}
		
		//valid
		System.out.println("Valid account number: " + accountNumber);
		
	}
	
	public static void testValidation(String testName, String accountNumber) {
		System.out.println(testName);
		try {
			validateAccountNumber(accountNumber);
		} catch (InvalidAccountNumberException e) {
			System.out.println(e.getMessage());
		} catch (InvalidAccountFormatException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
