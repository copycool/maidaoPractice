package cn.maidaotech.java07;

public class Student extends Person {
 
    public Student(String name, String address, String sex, int age) {
		super(name, address, sex, age);
		//TODO Auto-generated constructor stub
	}

	private int math;
    private int english;

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    
    public static void main(String[] args) {
        
    
    }

}


    
