package cn.maidaotech.java07.zuoye;

import org.springframework.util.SocketUtils;

//判断 101-200 之间有多少个素数，并输出所有素数。
public class findSushu {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean sShu = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    sShu = false;
                    break;
                }
            }
            if (sShu) {
                // System.out.println(count);
                count++;
            }
        }
        System.out.println("素数个数是：" + count);
    }
}
