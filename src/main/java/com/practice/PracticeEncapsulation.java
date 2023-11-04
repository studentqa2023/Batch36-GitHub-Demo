package com.practice;

public class PracticeEncapsulation {
	
	private int money=5;//variable with private access modifier
	private int salary;
	private String myname;
	
	public String getMyname() {//getter => return method
		return myname;
	}

	public void setMyname(String myname) {//setter => void
		this.myname = myname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
