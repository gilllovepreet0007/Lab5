package com.cg.eis.pl;

import java.lang.String;
import java.util.Scanner;

import com.cg.eis.service.EmployeeServiceImpl;       // Importing Service Package Class
import com.cg.eis.bean.Employee;                    // Importing Employee Package Class

public class GetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		EmployeeServiceImpl es=new EmployeeServiceImpl();    // Object of service class
		
		System.out.print("Enter ID : ");
		int id=sc.nextInt();
		sc.nextLine();                       // Cursor remain at int position so it will take input
		                                     // for name just after id hence in name ENTER will go
		                                     // so we need to consume that line
		
		System.out.print("Enter Name : ");
		String name= sc.nextLine();
		
		System.out.print("Enter Salary : ");
	    Double salary=Double.parseDouble(sc.nextLine());  // Above issue can also be removed this way
	    
	    System.out.print("Enter Designation : ");
		String designation= sc.nextLine();
		
		es.empDetailsGet(id,name,salary,designation);
		es.empDetailsShow();
		
		designation=designation.toLowerCase().replaceAll("\\s+","");
		es.schemeDetails(salary,designation);
	   

	}

}
