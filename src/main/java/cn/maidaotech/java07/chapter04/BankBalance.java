package cn.maidaotech.java07.chapter04;
//编写一个程序，创建一个 HashMap 对象，用于存储银行储户的信息
//（其中储户的主要信息有储 户的 ID、姓名和余额）。
//另外，根据储户 ID 获取其余额信息。
import java.util.HashMap;

public class BankBalance {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Customer> cus=new HashMap<>();
		Customer cus1=new BankBalance().new Customer(123, "崔灿灿", 500);
		Customer cus2=new BankBalance().new Customer(124, "刘梦梦", 300);
		Customer cus3=new BankBalance().new Customer(125, "王雪利", 700);
		
		cus.put(cus1.getID(), cus1);
		cus.put(cus2.getID(), cus2);
		cus.put(cus3.getID(), cus3);
		
		Customer customer = cus.get(123);
		System.out.println(customer);
	}


    class Customer{
	private int ID;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int iD, String name, double balance) {
		this.ID = iD;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", balance=" + balance + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (ID != other.ID)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	private String name;
	private double balance;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
    }
}