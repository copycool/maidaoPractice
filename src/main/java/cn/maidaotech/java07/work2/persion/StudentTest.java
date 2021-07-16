package cn.maidaotech.java07.work2.persion;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("张娜", "河南", "女", 23, 89.5, 105);
        System.out.println(student.message());
    }
}