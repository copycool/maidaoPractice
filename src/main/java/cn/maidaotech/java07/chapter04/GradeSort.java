package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

//某班有 40 个学生，学号为 190101~190140，
//全部参加 Java 集合阶段测试，给出所有同学的成绩 
//（可随机产生，范围为 50~100），
//请编写从程序将本班各位同学的成绩从高到低排序打印输出。 
//注：成绩相同时学号较小的优先打印，打印的信息包括学号、姓名（统一为“学生 i”[i=1，2，3， 4，...，40]）和成绩。
public class GradeSort {

    public static void main(String[] args) {
        Random random = new Random();
        List<Student> list = new ArrayList<Student>();
        for (int i = 1; i <= 40; i++) { // 将序号和成绩放入map
            int grade = random.nextInt((100 - 0) + 0);
            list.add(new Student(i, grade));
        }
        System.out.println("*********学生成绩如下：**********");
        for (Student stu : list) {
            System.out.println(stu);
        }
        Collections.sort(list);
        // 排序
        System.out.println("**********按成绩排序后：**********");
        for(Student stu: list){
            System.out.println(stu);
        }
    }

    static class Student implements Comparable<Student>{    //实现comparable的类的属性要是引用类型
        Integer id;
        Integer grade;
        @Override
        public int compareTo(Student o) {
            if(o instanceof Student){
                Student student = (Student)o;
                if(this.grade < student.grade){
                    return 1;
                }else if(this.grade > student.grade){
                    return -1;
                }else{
                    if(this.id < student.id){
                        return -1;
                    }else{
                        return 1;
                    }
               }   
            }
            throw new RuntimeException("传入的数据类型不一致！");
        }
        
    
        public Student(Integer id, Integer grade) {
			this.id = id;
			this.grade = grade;
		}
        public Student(){

        }
		

		@Override
		public String toString() {
			return "学生："+id + "||学号：" + (id+190100) + "||成绩：" + grade;
		}

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getGrade() {
            return grade;
        }

        public void setGrade(Integer grade) {
            this.grade = grade;
        }
    }
}