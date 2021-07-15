package cn.maidaotech.java07;

import java.time.LocalDate;
import java.time.LocalTime;

public class Java02_2_10_4 {

public static void main(String[] args) {
    
    /*  获取当前时间的时间戳 */
    Long startTs = System.currentTimeMillis();
    System.out.println("当前时间戳:"+startTs);
    /* 获取前一天当前时间的时间戳 */
    LocalTime time = LocalTime.now();
    LocalTime yesterDay=time.minusHours(24);
    System.out.println("前一天当前时间戳:"+yesterDay);
    /* 输出当前时间的年月日，格式为“yyyy-MM-dd” */
    LocalDate today = LocalDate.now();
    System.out.println("当前时间日期:"+today);
   /*  分别获取今天、昨天的开始时间和结束时间的时间戳 */

    /* 计算两个Date类型对象之间相隔的天数  */



}

    
}