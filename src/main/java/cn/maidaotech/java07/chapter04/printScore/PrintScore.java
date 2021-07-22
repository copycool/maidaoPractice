package cn.maidaotech.java07.chapter04.printScore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintScore {                  
    //某班有40个学生，学号为190101~190140，全部参加Java集合阶段测试，
    //给出所有同学的成绩（可随机产生，范围为50~100），请编写程序将本班各位同学的成绩从高到低排序打印输出。
    //注：成绩相同时学号较小的优先打印，打印的信息包括学号、姓名（统一为“学生i”[i=1，2，3，4，...，40]）和成绩。
    public static void main(String[] args) {
           Collections.sort(list);
           for (int i = 0; i < list.size(); i++) {
               int order = i+1;
               System.out.println("学生"+order+" "+list.get(i).getScore());
           }
        
    }

    static{
        name();
    }

    private static List<Student> list = new ArrayList<>();       
    private static void name(){
        for (int i = 190101; i < 190141; i++) {
            Student student = new Student(i, randomScore());
            list.add(student);
        }
    }
    private static double randomScore(){
        Double score = Math.random()*50+50;
        BigDecimal b = new BigDecimal(score);
        score = b.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
        return score;
    }
}