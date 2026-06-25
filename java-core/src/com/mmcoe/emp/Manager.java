package com.mmcoe.emp;
public class Manager extends Employee {
	public double comission;
	
	public Manager(double salary, double comission) {
		super(salary);
		this.comission=comission;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + comission;
	}
	

}
