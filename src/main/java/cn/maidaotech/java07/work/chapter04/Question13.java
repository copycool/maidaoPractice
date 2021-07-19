package cn.maidaotech.java07.work.chapter04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

public class Question13 {
    
    private static List<Student> list = new ArrayList<>();
    static {
        //初始化数据
        Student student = null;
        for (long i = 190101; i <= 190140 ; i++) {
            student = new Student(i,"student_"+(i-190100),(int) (Math.random()*50+51));
            list.add(student);
        }
    }
    
    public static void main(String[] args) {
        //打印所有同学信息
        System.out.println("排序前：");
        printList(list);
        System.out.println("将本班各位同学的成绩从高到低排序打印输出：");
        //排序
        Collections.sort(list,Student::compareTo);
        printList(list);
    }

    /**
     * 打印集合
     * @param list
     */
    public static void printList(List<Student> list){
        list.stream().forEach(item-> System.out.println(item.toString()));
    }
}
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Student implements Comparable{
    private Long sno;
    private String name;
    private Integer grade;

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student)){
            throw new RuntimeException("不能转换为Studentg类");
        }
        Student stuObj = (Student) o;
        return stuObj.getGrade() - this.getGrade();
    }
}