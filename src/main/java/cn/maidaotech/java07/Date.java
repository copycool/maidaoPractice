package cn.maidaotech.java07;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

import javax.management.InstanceAlreadyExistsException;
import javax.swing.text.DateFormatter;

import org.springframework.beans.propertyeditors.CurrencyEditor;

public class Date {
    public static void main(String[] args) {
        LocalDate Runnian = LocalDate.now();
       System.out.println(Runnian.isLeapYear() ? "今年是闰年" : "今年不是闰年");   
       //闰年
        
     LocalDate sc1 = LocalDate.of(2021, Month.JULY,14 ) ;
     System.out.println("Now Date="+ sc1);
     //当前日期  

     Instant now=Instant.now();
     System.out.println("Current Timestasp="+now);
     //现在时间戳

   
    final Scanner input=new Scanner(System.in);
    int max=0;
    int min=0;
    System.out.println("请输入第一个数");
    int one=input.nextInt();
    System.out.println("请输入第二个数");
    int two=input.nextInt();
    System.out.println("请输入第三个数");
    int three=input.nextInt();
    max=(one>two)?one:two;
    max=(max>three)?max:three;
    min=(one<two)?one:two;
    min=(min<three)?min:three;
    System.out.println("最大值是"+max);
    System.out.println("最小值是"+min);
    









    }

    
}