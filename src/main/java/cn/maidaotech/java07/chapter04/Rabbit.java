package cn.maidaotech.java07.chapter04;
// 一般而言，兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。
// 如果 所有兔子都不死，那么一年后可以繁殖多少对兔子？
public class Rabbit {
    public static int rabbits(int month){
        if(month<= 0)
        return 1;
        return rabbits(month-1)+rabbits(month-3);
    }
 public static void main(String[] args) {
     System.out.println(rabbits(12));
 }
}