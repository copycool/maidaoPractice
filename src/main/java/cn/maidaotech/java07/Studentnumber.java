package cn.maidaotech.java07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Studentnumber {
    public static void main(String[] args) {
        Scanner xh =new Scanner(System.in);
        System.out.println("请输入学号：xxxxxxxxx（8位）");
        int Id =xh.nextInt();

        System.out.println("入学年份："+getYear(Id));
        if ((Id%10000/100)<10) {
            System.out.println("期数为：0"+getsemester(Id));
        } else {System.out.println("期数为：getsemester(Id)");
            
        }
        System.out.println("序号为："+getserial(Id));
    }
        private static Integer getYear(Integer Id) {
        Integer year;
        year =Id/10000;
        return year;
    }
      private static Integer getsemester(Integer Id) {
      Integer semester;
      semester =Id % 10000/100;
      return semester;
}
    private static Integer getserial(Integer Id) {
    Integer serial;
    serial =Id % 100;
    return serial;


}
}