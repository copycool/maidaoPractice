package cn.maidaotech.chapter04.practice13;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
    List<Student> list = new ArrayList<Student>();
    for(int i=190101;i<190140;i++)
    {
        list.add(new Student(i,"张三"+i,(int)(Math.random()*100)+1));
    }
    System.out.println("排序前：");
    for(Student s : list){
        System.out.println(s);
    }
    System.out.println("排序后");
    list.stream().sorted().map(Student::toString).forEach(System.out::println);
}

    

}