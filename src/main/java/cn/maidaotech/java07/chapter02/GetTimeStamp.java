package cn.maidaotech.java07.chapter02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class GetTimeStamp {
    public static void main(String[] args) {

        // 获取当前时间的时间戳
        // 获取前一天当前时间的时间戳
        // 输出当前时间的年月日，格式为“yyyy-MM-dd”
        // 分别获取今天、昨天的开始时间和结束时间的时间戳
        // 计算两个Date类型对象之间相隔的天数

        LocalDateTime today = LocalDateTime.now();
        System.out.println("今天的当前时间戳："+today);
        System.out.println("昨天的当前时间戳："+today.minusDays(1));


        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("当前时间的年月日:"+format.format(date));

        Long timeStamp = System.currentTimeMillis();
        System.out.println("当前时间戳"+timeStamp);

        Date d = new Date();
        Long x = d.getTime();
        System.out.println("当前时间戳："+x);


        System.out.println("昨天的开始时间戳："+ getYesterdayStartTime().getTime());
        System.out.println("昨天的结束时间戳："+getYesterdayEndTime().getTime());
        System.out.println("今天的开始时间戳："+ getTodayStartTime().getTime());
        System.out.println("今天的结束时间戳："+ getTodayEndTime().getTime());


        //计算两个Date类型对象之间相隔的天数
       LocalDate d1 = LocalDate.of(2020, 01, 12);
       LocalDate d2 = LocalDate.of(2021, 12, 02);       
        Period period = Period.between(d1, d2);
        System.out.println("相差："+period.getYears()+"."+period.getMonths()+"."+period.getDays());
    }


    public static Date getYesterdayStartTime() {
        Calendar yesterdayStart = Calendar.getInstance();
        yesterdayStart.add(Calendar.DATE, -1);
        yesterdayStart.set(Calendar.HOUR_OF_DAY, 0);
        yesterdayStart.set(Calendar.MINUTE, 0);
        yesterdayStart.set(Calendar.SECOND, 0);
        yesterdayStart.set(Calendar.MILLISECOND, 0);
        return yesterdayStart.getTime();
    }
    public static Date getYesterdayEndTime() {
        Calendar yesterdayEnd = Calendar.getInstance();
        yesterdayEnd.add(Calendar.DATE, -1);
        yesterdayEnd.set(Calendar.HOUR_OF_DAY, 23);
        yesterdayEnd.set(Calendar.MINUTE, 59);
        yesterdayEnd.set(Calendar.SECOND, 59);
        yesterdayEnd.set(Calendar.MILLISECOND, 999);
        return yesterdayEnd.getTime();
    }
    public static Date getTodayStartTime() {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime();
    }
    public static Date getTodayEndTime() {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.set(Calendar.HOUR_OF_DAY, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTime();
    }




}