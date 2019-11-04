package com.oopadvanced.bankaaccount;

import java.util.ArrayList;

public class BankAccount {
	private String accountNum;
	private double checkBal;
	private double savBal;
	private static int accts;
	private static double total;
	
	public BankAccount() {
		accountNum = setActNum();
		accts++;
		
	}
	
	public static int actT() {
		System.out.println(accts+ " accounts");
		return accts;
	}
	public void setCheck(double n) {
		checkBal = n;
		total += n;
	}
	
	public void setSav(double n) {
		savBal = n;
		total += n;
	}
	
	public static void totall() {
		System.out.println(total);
	}
	
	private String setActNum() {	
		int x;
		String str = "";
		for(int i =0;i<10;i++) {
			x = (int)(Math.random()*10);
			str += Integer.toString(x);
		}
		return str;
	}
	public String getActNum() {
		return accountNum;
	}
	
	public double getCheckBal() {
		return checkBal;
	}
	
	public double getSavBal() {
		return savBal;
	}
	
	public void addSav(double num) {
		savBal += num;
		total += num;
	}
	
	public void addCheck(double num) {
		checkBal += num;
		total += num;
	}
}
