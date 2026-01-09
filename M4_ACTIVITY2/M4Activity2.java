package bpi.module4.activity2;

public class M4Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMSystem atmSystem = new ATMSystem();
		System.out.println("=== ATM Withdrawal System ===");
		System.out.println("--- Test 1: Valid Withdrawal ---");
		atmSystem.processWithdrawal("1", "5000");
		System.out.println();
		System.out.println("--- Test 2: Invalid Account Index ---");
		atmSystem.processWithdrawal("abc", "5000");
		System.out.println();
		System.out.println("--- Test 3: Account Not Found ---");
		atmSystem.processWithdrawal("10", "5000");
		System.out.println();
		System.out.println("--- Test 4: Insufficent Funds ---");
		atmSystem.processWithdrawal("1", "20000");
		System.out.println();
		System.out.println("=== All tests completed! ===");
	}

}
