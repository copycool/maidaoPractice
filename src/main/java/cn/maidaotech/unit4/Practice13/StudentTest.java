package cn.maidaotech.java07.unit4.Practice13;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Integer max=100;
        Integer min=50;
        List<Student> list=new ArrayList<>();
        for(int i=190101;i<=190140;i++){
            list.add(new Student(i,"小红"+i,(int)(Math.random()*(max-min)+min)));
        }
        System.out.println("===============排序前=============");
        for(Student s:list){
            System.out.println(s);
        }
        System.out.println("===============排序后=============");
        list.stream().sorted().map(Student::toString).forEach(System.out::println);
    }
}