package cn.maidaotech.java07.chapter02;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        {
            Date now = new Date();
            System.out.println(now);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(now));
            try{
                Date date = sdf.parse("2021-07-01 08:10:00");
            }catch(Exception e){
                e.printStackTrace();
            }
            now.getTime();
        }
        {
            Calendar cal = Calendar.getInstance();
            System.out.println(cal.get(Calendar.YEAR));
            System.out.println(cal.get(Calendar.MONTH));
            System.out.println(cal.get(Calendar.DAY_OF_WEEK));
            cal.set(Calendar.YEAR, 2020);
            cal.add(Calendar.YEAR, -1);

            cal.getTime();
            cal.setTime(new Date());

        }

        {
            LocalDate today = LocalDate.now();
            System.out.println("Current Date=" + today);
            System.out.println(LocalDate.of(2021, 7, 14));
            LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
            System.out.println("100th day of 2014=" + hundredDay2014);
            today.minusYears(1);
            today.plusDays(1);
            today.atTime(10, 10);

            LocalTime time = LocalTime.now();
            time.atDate(LocalDate.of(2020, 1, 1));

            LocalDate t1 = LocalDate.of(2019, 5, 18);
            LocalDate t2 = LocalDate.of(2022, 1, 18);
            Period period = Period.between(t1, t2);
            System.out.println(period.getYears());
            System.out.println(period.getMonths());
            System.out.println(period.toTotalMonths());
            System.out.println(period.getDays());
            System.currentTimeMillis();
        }
    }
}
