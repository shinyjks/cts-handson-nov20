package com.org.day3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Service service = new Service();
		
		int n = 1, flag = 0;
		
		do
		{
			System.out.println("Choose a number between 1 - 8");
			System.out.println("1. Add an employee");
			System.out.println("2. Find an employee by Id");
			System.out.println("3. Display all the employees");
			System.out.println("4. Sort the employee list by Id");
			System.out.println("5. Sort the employee list by Name");
			System.out.println("6. Sort the employee list by DOB");
			System.out.println("7. Sort the employee list by Salary");
			System.out.println("8. Exit");
			System.out.println();
			
			n = sc.nextInt();
			
			switch(n)
			{
				case 1: System.out.println("Enter ID");
				 		int id = sc.nextInt();
				 		System.out.println("Enter Name");
				 		String name = sc.next();
				 		System.out.println("Enter DOB (format : yyyy-MM-dd)");
				 		String dob = sc.next();
				 		LocalDate date = LocalDate.parse(dob);
				 		System.out.println("Enter Salary");
				 		float salary = sc.nextFloat();
				 		service.add(new Employee(id, name, date, salary));
				 		System.out.println();
				 		break;
				 		
				case 2: System.out.println("Enter Employee Id");
				 		int empId = sc.nextInt();
				 		System.out.println(service.findById(empId));
				 		System.out.println();
				 		break;
				 		
				case 3: System.out.println("Employee List");
				 		service.display().forEach(emp -> System.out.println(emp));
				 		System.out.println();
				 		break;
				 		
				case 4: System.out.println("Sorted list by Id");
				 		service.sortById();
				 		service.display().forEach(emp -> System.out.println(emp));
				 		System.out.println();
				 		break;
				 		
				case 5: System.out.println("Sorted list by Name");
				 		service.sortByName();
				 		service.display().forEach(emp -> System.out.println(emp));
				 		System.out.println();
				 		break;
				 		
				case 6: System.out.println("Sorted list by DOB");
				 		service.sortByDOB();
				 		service.display().forEach(emp -> System.out.println(emp));
				 		System.out.println();
				 		break;
				 		
				case 7: System.out.println("Sorted list by Salary");
				 		service.sortBySalary();
				 		service.display().forEach(emp -> System.out.println(emp));
				 		System.out.println();
				 		break;
				 		
				case 8: flag = 1;
				 		break;
				 		
				default: System.out.println("Invalid number");
				 		 break;
			}
			
		}while(flag != 1);
	}
}
