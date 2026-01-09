package bpi.module4.activity5;

public class M4Activity5 {

	public static void main(String[] args) {
		AccountValidator accountValidator = new AccountValidator();
		System.out.println("=== Account Number Validation Test ===");
		accountValidator.testValidation("\nTest 1: Valid account (1234567890)", "1234567890");
		accountValidator.testValidation("\nTest 2: Too short (123)", "123");
		accountValidator.testValidation("\nTest 3: Contains letters (12345ABC90)", "12345ABC90");
		accountValidator.testValidation("\nTest 4: Contains space (1234 567890)", "1234 567890");
		accountValidator.testValidation("\nTest 5: Null value", null);
	}

}
