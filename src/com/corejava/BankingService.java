package com.corejava;

import java.util.Scanner;

//Display all account details
// Search by account number
//Withdraw
//Deposit
//Exit
public class BankingService {
	private String accno;
	private String name;
	private long balance;
	private String acc_type;
	
	Scanner sc = new Scanner(System.in);
	//Function which will open a new account
	
	public void openBankAccount()
	{
		System.out.println("Enter account number:");
		accno = sc.next();
		
		System.out.println("Enter account name:");
		name = sc.next();
		
		System.out.println("Enter account balance:");
		balance = sc.nextLong();
		
		System.out.println("Enter account type:");
		acc_type = sc.next();
		
	}
	// Function to display the account details
	
	public void displayAccountDetails()
	{
		System.out.println("Name of the account holder :" +name);
		System.out.println("Account Number : " +accno);;
		System.out.println("Balance :" +balance);
		System.out.println("Account Type: " + acc_type);
		
	}


//Function to deposit

   public void  deposit()
   {
	   long amount;
	   System.out.println("Enter the amount ");
	   amount = sc.nextLong();
	   balance = balance+amount;
   }
   
   //Function to withdraw
   public void withdraw()
   {
	   long amt;
	   System.out.println("Enter the amount you want to withdraw!");
	   amt = sc.nextLong();
	   
	   if(balance >= amt)
	   {
		   balance = balance-amt; 
		   System.out.println("Balance after withdrawal :" +balance);
	   }
	   else
	   {
		   System.out.println("Your balance is less than" +amt + "Transaction could not completed");
	   }
   }
   
   public boolean search(String accno)
   {
	   if(accno.equals(accno)) {
		   displayAccountDetails();
		   return true;
	   }
	   return false;
   }
}