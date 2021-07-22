package cn.maidaotech.java07.order.forthpractice13;
// 某班有40个学生，学号为190101~190140，全部参加Java集合阶段测试，
// 给出所有同学的成绩（可随机产生，范围为50~100），请编写从程序将本班各位同学的成绩从高到低排序打印输出。
// 注：成绩相同时学号较小的优先打印，
// 打印的信息包括学号、姓名（统一为“学生i”[i=1，2，3，4，...，40]）和成绩。
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
    List<Student> list1 = new ArrayList<Student>();
    for (int i = 190101; i <= 190140; i++) {
        list1.add(new Student(i,(int)(Math.random()*50+50)));
    }
    //遍历list1
    // for (Student s : list1) {
    //     System.out.println(s);
    // }
     Collections.sort(list1);
     list1.stream().sorted().map(Student::toString).forEach(System.out::println);
}
}
