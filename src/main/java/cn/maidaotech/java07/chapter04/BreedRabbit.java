package cn.maidaotech.java07.chapter04;

public class BreedRabbit {
    //一般而言，兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。
    //如果所有兔子都不死，那么一年后可以繁殖多少对兔子？
    //前两个月的兔子的总数就是当前月的可以繁殖的兔子总数 
    //所以当前月兔子总数等于上个月兔子总数 + 上个月可以繁殖的兔子数（前三个月的兔子总数）
    public static void main(String[] args) {
        System.out.println(rabbit(12)); 
    }
    public static int rabbit(int month){
        if (month <= 2) {
            return 2;
        }
        return rabbit(month-1) + rabbit(month-3);
    }
}