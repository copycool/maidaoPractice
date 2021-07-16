package cn.maidaotech.java07.chapter03;

public class Worker extends People {
    private double salary;
    
    

	public Worker(String id, String name, int age, double salary) {
		super(id, name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	
}