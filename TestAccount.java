package module6;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		account.setAccNo(1);
		account.setAccBalance(4545);
		account.setAccName("ajay");
		System.out.println(account);

		System.out.println("creating new object");
		Account account1 = new Account(12345, "SBI akshay", 3425434.43);
		System.out.println(account1);
	}

}
