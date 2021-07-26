package cn.maidaotech.java07.chapter02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import org.springframework.cglib.core.Local;


public class DataLearn {
    public static void main(String[] args) {
        // Date now = new Date();
        // Date d = new Date(1555921610000L);
        // SimpleDateFormat sdf =  new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss:SS");
        // System.out.println(now);
        // System.out.println(d); 
        // System.out.println(sdf.format(now)); 
        //date不适用了，改为用calendar
        // Calendar cal = Calendar.getInstance();
        // System.out.println(cal);
        // System.out.println();
        // System.out.println(cal.get(Calendar.YEAR));
        // System.out.println(cal.get(cal.get(Calendar.MONTH)));
        // // System.out.println(cal.get(cal.get(Calendar.DAY_OF_MONTH)));
        // System.out.println(cal.get(cal.get(Calendar.HOUR_OF_DAY)));
        // System.out.println(cal.get(Calendar.MINUTE));
        // System.out.println(cal.get(Calendar.SECOND));
        // System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        // Date date = cal.getTime();
        // System.out.println(sdf.format(date)); 
        
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate s = LocalDate.of(2020, Month.JULY,6);
        System.out.println(s);
        LocalDate ten = LocalDate.ofYearDay(2021, 10);
        System.out.println(ten);
        LocalDate anther = now.withYear(2015);
        System.out.println(anther);
        System.out.println(now.isLeapYear());
        System.out.println(now.getYear()+"年有"+now.lengthOfYear());
    }
}
