package cn.maidaotech.java07;



public class Student extends Person {

    private int math;
    private int english;

    /* public Student() {
    } */

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

    public Student(String name, String address, String sex, int age, int math, int english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }


    public static void main(String[] args) {
        Student s1=new Student("张三","男","河南省",18,60,50);
        Student s2=new Student("李四", "男", "郑州", 18, 70, 30);
        Student [] students={s1,s2};
        /* System.out.println(s1.getName());
        System.out.println(s1.getAddress());
        System.out.println(s1.getSex());
        System.out.println(s1.getAge());
        System.out.println(s1.getMath());
        System.out.println(s1.getEnglish()); */
        for (Student a : students) {
            outPut(a);
        }


    }
    public static void  outPut(Student a ) {
        System.out.println(a.getName());
        System.out.println(a.getAddress());
        System.out.println(a.getSex());
        System.out.println(a.getAge());
        System.out.println(a.getMath());
        System.out.println(a.getEnglish());
    }
}
