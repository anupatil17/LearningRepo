package com.mmcoe.bank;

public class TestAccount {
	public static void main(String[] args) {
		Accounts a=new Accounts(5000);
		try {
			a.withdraw(50000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // Used by developers : for trouble shooting
			System.out.println(e); //logging the system behavior
			System.out.println(e.getMessage()); //End user
		}
/*		a.withdraw(3000);
		System.out.println(a);
		a.withdraw(7000);
		System.out.println(a);
		a.deposit(2000);
		System.out.println(a);
		a.deposit(5000);
		System.out.println(a);*/
}
}