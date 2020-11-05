package com.cg.eis.service;

public interface EmployeeService {
	public void empDetailsGet(int id,String name,double salary,String designation);
	public void empDetailsShow();
	public void schemeDetails(double salary,String designation);

}
