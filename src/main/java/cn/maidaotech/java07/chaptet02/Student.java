package cn.maidaotech.java07;

public class Student {
    private static Student u;
    
    public static void main(String[] args) {

        Student.u = new Student();
        u.studentid(20200101);
    }

public void studentid(int studentid){

    int id = studentid;
    int year ;
    int month ;
    int day ;
    year = id /10000;
    month = (id%10000)/100;
    day = (id%10000)%100;
    
    System.out.println("年："+year+ " 月:" +month +" 日:"+ day);
    }

}