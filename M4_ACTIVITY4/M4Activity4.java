package bpi.module4.activity4;

public class M4Activity4 {

	public static void main(String[] args) {
		AccountValidator accountValidator = new AccountValidator();
		
			//Case 1
			try {
				accountValidator.validateAccountNumber("1234567890");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			
			//Case 2
			try {
				accountValidator.validateAccountNumber("123");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			
			//Case 3
			try {
				accountValidator.validateAccountNumber(null);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		
	}

}
