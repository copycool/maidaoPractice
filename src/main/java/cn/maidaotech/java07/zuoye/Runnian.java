package cn.maidaotech.java07.zuoye;

//判断某一年是否为闰年
public class Runnian {

    public static void main(String[] args) {
        Integer year = 2000;
        if (year % 4 == 0) {
            System.out.println(year + "是闰年");
        }
    }
}
