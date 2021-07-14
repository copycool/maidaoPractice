package cn.maidaotech.java07.chapter02.practice.test210;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now.toEpochMilli());// 输出当前时间戳
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date date = cal.getTime();
        Instant fromDate = date.toInstant();
        System.out.println(fromDate.toEpochMilli()); // 获取前一天时间戳
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        df.format(localDate);
        System.out.println(localDate); // 输出当前时间格式
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        today.set(Calendar.MILLISECOND, 0);
        System.out.println(today.getTime().getTime()); // 今天开始时间戳
        today.set(Calendar.HOUR, 23);
        today.set(Calendar.MINUTE, 59);
        today.set(Calendar.SECOND, 59);
        today.set(Calendar.MILLISECOND, 999);
        System.out.println(today.getTime().getTime()); // 今天结束时间戳
        Calendar yestoday = Calendar.getInstance();
        yestoday.add(Calendar.DAY_OF_MONTH, -1);
        yestoday.set(Calendar.HOUR, 0);
        yestoday.set(Calendar.MINUTE, 0);
        yestoday.set(Calendar.SECOND, 0);
        yestoday.set(Calendar.MILLISECOND, 0);
        System.out.println(yestoday.getTime().getTime()); // 昨天开始时间戳
        yestoday.set(Calendar.HOUR, 23);
        yestoday.set(Calendar.MINUTE, 59);
        yestoday.set(Calendar.SECOND, 59);
        yestoday.set(Calendar.MILLISECOND, 999);
        System.out.println(yestoday.getTime().getTime()); // 昨天结束时间戳

        Date day1 = new Date(today.getTime().getTime());
        Date day2 = new Date(yestoday.getTime().getTime());
        System.out.println(day1.compareTo(day2)); // 比较两个Date差几天
    }
}