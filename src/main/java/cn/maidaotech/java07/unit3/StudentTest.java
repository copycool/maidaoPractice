package cn.maidaotech.java07.unit3;

public class StudentTest {
 public static void main(String[] args) {
     Student s1=new Student("李鼎凯", "漳州市", "男", "19", "97", "90");
     Student s2=new Student("郭腾", "郑州市", "男", "18", "96", "94");
     Student [] students={s1,s2};
for(int i=0;i<students.length;i++){
    output(students[i]);
    System.out.println();
}

}
public static void output(Student student) {
    System.out.println("名字："+student.getName());
    System.out.println("地址："+student.getAddress());
    System.out.println("性别："+student.getSex());
    System.out.println("年龄："+student.getAge());
    System.out.println("数学成绩："+student.getMath());
    System.out.println("英语成绩："+student.getEnglish());
}

}