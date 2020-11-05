package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl extends Employee implements EmployeeService{

	@Override
	public void empDetailsGet(int id,String name,double salary,String designation) {
		
		setId(id);
		setName(name);
		setSalary(salary);
		setDesignation(designation);
		
	}

	@Override
	public void empDetailsShow() {
		// TODO Auto-generated method stub
		System.out.println("Emp ID : " + getId());
		System.out.println("Name : " + getName());
		System.out.println("Salary : " + getSalary());
		System.out.println("Designation : " + getDesignation());
		
	}

	@Override
	public void schemeDetails(double s,String d) {
		// TODO Auto-generated method stub
		if (s>5000 && s<20000 && d.equals("systemassociate")) {      //Comparing object string
			setInsuranceScheme("Scheme C");                         // therefore == not valid
			System.out.println(getInsuranceScheme());
		}
		else if (s>=20000 && s<40000 && d.equals("programmer")) {
			setInsuranceScheme("Scheme B");
			System.out.println(getInsuranceScheme());
		}
		else if (s>=40000 && d.equals("manager")) {
			setInsuranceScheme("Scheme A");
			System.out.println(getInsuranceScheme());
		}
		else if (s<5000 && d.equals("clerk")) {
			setInsuranceScheme("No Scheme");
			System.out.println(getInsuranceScheme());
		}
		else {
			System.out.println("Not VALID Input");
		}
		
	}

	
}
	

