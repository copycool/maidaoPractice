package cn.maidaotech.java07.work.chapter04.question9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//
//        List<Integer> integerList = list.subList(17,20);
//        System.out.println(integerList);
        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(3)+1 );
        }
        
    /**
     * 求最大公约数
     * @param legth
     * @param width
     * @return
     */
    // public static Integer maxSideLength(int legth,int width){
    //     //求出两个数字之间的小值
    //     int min = legth < width ? legth : width;
    //     //这种方法运用了数学公式中的辗转相除法
    //     for (int i = min;i >= 1;i --) {
    //         if (legth % i == 0 && width % i == 0) {
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
//     int w = 68;
//     int l = 168;
//    //假设最大边长为  SideLength 米
//     Integer sideLength = 0;
    
    }
}