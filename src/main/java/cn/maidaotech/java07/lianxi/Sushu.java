package cn.maidaotech.java07.lianxi;

import java.util.*;

public class Sushu {

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
        // System.out.println(count);
        System.out.println("The number of prime number <" + " is " + count);

    }
    // Todo

}
