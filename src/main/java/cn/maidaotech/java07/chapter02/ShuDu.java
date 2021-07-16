package cn.maidaotech.java07.chapter02;

import java.util.Arrays;

public class ShuDu {
    public static void main(String[] args) {
        int[] array = {0, 0, 4, 6, 0, 2, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(fill(array)));
    }

    public static int[] fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                continue;
            }
            int fillNumber = 1;
            while (exist(array, fillNumber)) {
                fillNumber++;
            }
            array[i] = fillNumber;
        }
        return array;
    }

    public static boolean exist(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
    
}