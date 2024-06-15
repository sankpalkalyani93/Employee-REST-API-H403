package com.example.EmployeeProject;

public class Employee {

	private int empid;
	private String empname;
	private float empsalary;
	private String empcompany;
	
	public Employee() {}
	
	public Employee(int empid, String empname, float empsalary, String empcompany) {
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empcompany = empcompany;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpcompany() {
		return empcompany;
	}
	public void setEmpcompmany(String empcompmany) {
		this.empcompany = empcompmany;
	}
	
	
}
