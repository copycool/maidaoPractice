package cn.maidaotech.java07.chapter04.practice13;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List <Student> list = new ArrayList<Student>();
        for(int i=190101;i<190141;i++ ){
            list.add(new Student("xiaoyu"+i,i,(int) (Math.random() * (100-50+1)) + 50));
        }
        System.out.println("排序前：");
        for(Student o:list){
            System.out.println(o);
        }
      System.out.println("排序后：");
      list.stream().sorted().map(Student::toString).forEach(System.out::println);
    }

    
}