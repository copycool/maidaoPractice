package cn.maidaotech.java07.java01;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Data {
    {
        SimpleDateFormat adf = new SimpleDateFormat("yyyy--mm--dd hh:mm:ss");
        System.out.println();
    }

    {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);
        cal.get(Calendar.DAY_OF_WEEK);
        cal.add(Calendar.YEAR, -1);// 去年
        cal.getTime();// 转换
        cal.setTime(new Date());

    }
    //jdk以后的时间

    {
//LocalDate.today=LocalDate.now();
System.out.println();
LocalDate.of(2021,7,14);

    }
    public static void main(String[] args) {
        //System.out.println(todayisLeapyear（）？ );
    }
}
