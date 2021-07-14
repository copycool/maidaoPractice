package cn.maidaotech.java07.chapter02.datePractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//计算两个Date类型对象之间相隔的天数
public class BetweenTime {
    public static void main(String[] args) throws ParseException {
        long l = System.currentTimeMillis();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//        System.out.println("请输入yyyy/MM/dd hh:mm:ss格式的时间：");
//        Scanner sc = new Scanner(System.in);
//        String writeTime = sc.next();
        String time = "2020/02/02 12:00:00";
        Date date = df.parse(time);
        long l2 = date.getTime();
        long l3 = (l-l2)/(24*60*60*1000);
        System.out.println(l3+"天");
    }
}
