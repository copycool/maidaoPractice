package cn.maidaotech.java07.work;

import java.util.Scanner;

public class CheckMaxMin {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = input.nextInt();
        }
        gitMaxMin(arr);
        input.close();
    }

    public static void gitMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}