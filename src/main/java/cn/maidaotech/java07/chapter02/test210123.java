package cn.maidaotech.java07.chapter02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test210123 {
    public static void main(String[] args) {
        // 获取当前时间的时间戳
        System.out.println("获取当前时间的时间戳: " + System.currentTimeMillis());



        // 获取前一天当前时间的时间戳
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date time = cal.getTime();
        System.out.println("昨天的时间" + time);
        Long lastTime = time.getTime();
        System.out.println("获取前一天当前时间的时间戳: " + lastTime);




        // 输出当前时间的年月日，格式为“yyyy-MM-dd”
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("输出当前时间的年月日:" + sdf.format(date));




        // 分别获取今天、昨天的开始时间和结束时间的时间戳
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("输出当前时间的开始时间:" + sdf2.format(getTodayStartTime()));
        System.out.println("输出当前时间的结束时间:" + sdf2.format(getTodayEndTime()));
        System.out.println("输出当前时间的开始时间的时间戳:" + getTodayStartTime().getTime());
        System.out.println("输出当前时间的结束时间的时间戳:" + getTodayEndTime().getTime());

        System.out.println("输出昨天时间的开始时间:" + sdf2.format(getYesterdayStartTime()));
        System.out.println("输出昨天时间的结束时间:" + sdf2.format(getYesterdayEndTime()));
        System.out.println("输出昨天时间的开始时间的时间戳:" + getYesterdayStartTime().getTime());
        System.out.println("输出昨天时间的结束时间的时间戳:" + getYesterdayEndTime().getTime());




        
        // 计算两个Date类型对象之间相隔的天数
       Calendar cal1=Calendar.getInstance();
       cal1.set(1998, 8, 18);
      // System.out.println(cal1);
       Date date1=cal1.getTime();
       Long d1=date1.getTime();
       System.out.println(d1);
       Calendar  cal2=Calendar.getInstance();
       cal2.set(2000, 1, 26);
     //  System.out.println(cal2);
       Date date2=cal2.getTime();
      // System.out.println(date2);
       Long d2=date2.getTime();
       System.out.println(d2);
       System.out.println("相差的天数为："+Math.abs(d1-d2)/24/3600000);

      

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

}