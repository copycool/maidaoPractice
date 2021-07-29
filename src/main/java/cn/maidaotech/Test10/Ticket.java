package cn.maidaotech.java07.unit6.Test10;

public class Ticket {
    private int  number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Ticket [number=" + number + "]";
	}

	public Ticket(int number) {
		this.number = number;
	}
	
}