package bpi.module4.activity1;

public class M4Activity1 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount();

		System.out.println("=== Bank Account Name Display ===");
		System.out.println();
		bankAccount.testCase("ACC-001");
		System.out.println();
		bankAccount.testCase("ACC-099");
		System.out.println();
		System.out.println("=== Program completed successfully! ===");
		
	}

}
