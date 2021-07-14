package cn.maidaotech.java07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTest {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(now));

        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);//月份从0开始，值域0-11
        cal.get(Calendar.DATE);
        cal.get(Calendar.HOUR_OF_DAY);

                //System.out.println(Calendar.YEAR);

    }
}