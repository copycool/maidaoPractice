package cn.maidaotech.java07.chapter02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class GetTimeStamp {
    public static void main(String[] args) {

        // 获取当前时间的时间戳
        Date now = new Date();
        System.out.println(now);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time=" + time);

        // 获取前一天当前时间的时间戳
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -1); // 减一天，变为前一天
        Date date = cal.getTime();
        System.out.println(date);

        // 输出当前时间的年月日，格式为“yyyy-MM-dd”
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        // 分别获取今天、昨天的开始时间和结束时间的时间戳
        //不完善
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        System.out.println(todayStart.getTime().getTime());

        // 计算两个Date类型对象之间相隔的天数
        LocalDate date1 = LocalDate.of(2020, 2, 11);
        LocalDate date2 = LocalDate.of(2021, 7, 11);
        Period period = Period.between(date1, date2);
        System.out.println("period=" + period);
        System.out.println(period.getYears() + "年" + period.getMonths() + "月（共" + period.toTotalMonths() + "个月）"
                + period.getDays() + "天");
        period = Period.of(10, 0, 0);
        
    }
}