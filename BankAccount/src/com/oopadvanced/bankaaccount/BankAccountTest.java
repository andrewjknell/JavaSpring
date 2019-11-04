package com.oopadvanced.bankaaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount();
		BankAccount bank2 = new BankAccount();
		
		bank1.setCheck(0);
		bank1.setSav(100);		
		bank2.setCheck(0);
		bank2.setSav(100);
		
		System.out.println(bank1.getCheckBal());
		System.out.println(bank1.getSavBal());
		System.out.println(bank2.getCheckBal());
		System.out.println(bank2.getSavBal());
		System.out.println("-----------------------");
		
		bank1.addCheck(25);
		bank1.addSav(5);
		bank2.addCheck(55);	
		bank2.addSav(100);
		
		System.out.println(bank1.getCheckBal());
		System.out.println(bank1.getSavBal());
		System.out.println(bank2.getCheckBal());
		System.out.println(bank2.getSavBal());
		System.out.println("-----------------------");

		bank1.actT();
		bank1.totall();
		
	}

}
