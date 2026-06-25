package com.mmcoe.emp;
public class Clerk extends Employee{
	public double bonus;
	
	public Clerk(double salary,double bonus) {
		super(salary);
		this.bonus=bonus;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+bonus;
	}
	

}
