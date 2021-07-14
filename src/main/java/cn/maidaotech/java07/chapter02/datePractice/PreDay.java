package cn.maidaotech.java07.chapter02.datePractice;

import java.util.Calendar;
import java.util.Date;

public class PreDay {
    public static void main(String[] args) {
        Calendar cale = Calendar.getInstance();
        cale.setTime(new Date());
        cale.add(Calendar.DAY_OF_MONTH,-1);
        Date time = cale.getTime();
        System.out.println(time);

    }
}
