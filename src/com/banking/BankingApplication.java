package com.banking;

import java.util.Scanner;

public class BankingApplication {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	public BankingApplication(String customerName, String customerId) {
		
		this.customerName = customerName;
		this.customerId = customerId;
	}
	public void deposit(int amount) {
		if (amount!=0) {
			balance=balance+amount;
			previousTransaction=amount;
		}
		
	}
	public void withdraw(int amount) {
		if (amount!=0) {
			balance=balance-amount;
			previousTransaction=-amount;
		}
	}
	public void getPreviousTransaction() {
		if (previousTransaction>=0) {
			System.out.println("deposit:"+previousTransaction);
		}
		else if(previousTransaction<=0) {
			System.out.println("withdraw:"+Math.abs(previousTransaction));
		}
		else {
			System.out.println("no transaction occured");
		}
			
	}
	public void showMenu() {
		char option='\0';
		Scanner scan=new Scanner(System.in);
		System.out.println();
		System.out.println("customer name is"+customerName); 
		System.out.println("customer id "+customerId);
		System.out.println("chooose option");
		System.out.println("A.check balance");
		System.out.println("B.deposit");
		System.out.println("C.withdraw");
		System.out.println("D.previousTransaction");
		System.out.println("E.exit");
	
	do {
		System.out.println("enter the option");
		option=scan.next().charAt(0);
		
		switch (option) {
		case 'A':
			System.out.println("your balance is "+balance);
			break;
		case 'B':
			System.out.println("enter the amount to deposit");
			int amount=scan.nextInt();
			deposit(amount);
			System.out.println();
			break;
		case 'C':
			System.out.println("enter the withdraw amount");
			int amount2=scan.nextInt();
			withdraw(amount2);
			System.out.println();
			break;
		case 'D':
			System.out.println("previousTransaction is ");
			getPreviousTransaction();
			break;
		case 'E':
			System.out.println("-------------------");
			break;
		default:
			System.out.println("enter valid inputs");
					
					
		}
		
	   }while (option!='E');
	}
	
	

}
