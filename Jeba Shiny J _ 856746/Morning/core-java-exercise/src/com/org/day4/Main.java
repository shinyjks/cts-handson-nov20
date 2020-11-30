package com.org.day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Service service = new Service();
		
		int n, flag = 0;
		
		do
		{
			System.out.println("Choose a number between 1 - 6");
			System.out.println("1. Add an account");
			System.out.println("2. Find an account by Account Number");
			System.out.println("3. Display all the Accounts");
			System.out.println("4. Remove an account by Account Number");
			System.out.println("5. Display accounts having balance less than 1000");
			System.out.println("6. Exit");
			System.out.println();
			
			n = sc.nextInt();
			
			switch(n)
			{
			case 1: System.out.println("Enter Account Number");
			 		int accNo = sc.nextInt();
			 		try {
			 			if(service.findByAccNo(accNo) != null)
			 				throw new MyException();
			 			System.out.println("Enter Account Balance");
				 		float accBalance = sc.nextFloat();
				 		service.add(new Account(accNo, accBalance));
				 		System.out.println("Account Added");
			 		} catch (MyException e) {
			 			System.out.println("Account already exists");
			 		}
			 		System.out.println();
			 		break;
			 		
			case 2: System.out.println("Enter Account Number");
			 		int accNo1 = sc.nextInt();
			 		try {
			 			if(service.findByAccNo(accNo1) == null)
			 				throw new MyException();
			 			System.out.println(service.findByAccNo(accNo1));
			 		} catch (MyException e) {
			 			System.out.println("Account Not Found");
			 		}
			 		System.out.println();
			 		break;
			 		
			case 3: System.out.println("All Account Details");
			 		service.display().forEach(acc -> System.out.println(acc));
			 		System.out.println();
			 		break;
			 		
			case 4: System.out.println("Enter Account Number");
			 		int accNo2 = sc.nextInt();
			 		try {
			 			if(service.findByAccNo(accNo2) == null)
			 				throw new MyException();
			 			else
			 				service.remove(accNo2);
			 				System.out.println("Account Removed");
			 		} catch (MyException e) {
			 			System.out.println("Account Not Found");
			 		}
			 		System.out.println();
			 		break;
			 		
			case 5: System.out.println("Accounts having balance less than 1000");
			 		service.displayByBalance().forEach(acc -> System.out.println(acc));
			 		System.out.println();
			 		break;
			 		
			case 6: flag = 1;
			 		break;
			 		
			default: System.out.println("Invalid Number");
			 		 break;
			}
			
		} while(flag != 1);
	}

}
