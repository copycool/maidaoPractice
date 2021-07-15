package cn.maidaotech.java07.chapter02;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    private static final long MILLISECOND_OF_DAY = 24 * 60 * 60 * 1000;

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("昨天的当前时间戳：" + addByDay(now, -1).getTime());
        System.out.println("昨天的开始时间戳：" + getDayStart(addByDay(now, -1)));
        System.out.println("今天的开始时间戳：" + getDayStart(now));
        System.out.println("今天的结束时间戳：" + getDayStart(addByDay(now, 1)));
        Date start = new Date(1585854777799L);
        System.out.println("相差天数：" + betweenDays(start, now));

    }

    public static Date addByDay(Date date, int num) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_YEAR, num);
        return cal.getTime();
    }

    public static Long getDayStart(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis();
    }

    public static int betweenDays(Date start, Date end) {
        Long milli = end.getTime() - start.getTime();
        return (int) (milli / MILLISECOND_OF_DAY);
    }
}
