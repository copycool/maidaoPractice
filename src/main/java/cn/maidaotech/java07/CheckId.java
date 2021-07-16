package cn.maidaotech.java07;

import java.util.Arrays;
import java.util.Scanner;
public class CheckId {
    public static final String rule = "^[1-9]\\d{5}(19|20)\\d{2}((0[1-9])|10|11|12)(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]";
    public static void main(String[] args) {
        /* Scanner input = new Scanner(System.in);
        System.out.println("请输入身份证号码用于校验:");
        String id_card=input.next();
        boolean check= checkID(id_card);
        System.out.println("您输入的身份证号码:"+id_card+"为"+check);
        input.close(); */

        int[] array = {0, 0, 4, 6, 0, 2, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(fill(array)));
    }

    public static int[] fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                continue;   //跳出本次
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