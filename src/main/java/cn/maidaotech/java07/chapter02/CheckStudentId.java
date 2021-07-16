package cn.maidaotech.java07.chapter02;

import java.util.Scanner;

public class CheckStudentId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：XXXXXXXX(8位)");
        int Id = sc.nextInt();
        System.out.println("入学年份为："+getYear(Id));
        if ((Id % 10000 / 100) < 10) {
            System.out.println("期数为：0"+getIssue(Id));
        }else{
            System.out.println("期数为："+getIssue(Id));
        }
        if ((Id % 100) < 10) {
            System.out.println("序号为：0"+getNumber(Id));
        }else{
            System.out.println("序号为："+getNumber(Id));
        }
       

    }
    private static Integer getYear(Integer Id){
        Integer year;
        year = Id / 10000;
        return year;
    }
    private static Integer getIssue(Integer Id){
        Integer issue;
        issue = Id % 10000 / 100;
        return issue;
    }
    private static Integer getNumber(Integer Id){
        Integer number = Id % 100;
        return number;
    }
}
