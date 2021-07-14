package cn.maidaotech.java07.work;

import java.util.Scanner;

public class StudentId {
    public static void main(String[] args) {
        stuId();
    }

    /**
     * 分割学号
     * 
     * @param studentNum 学生学号
     */
    private static void stuId() {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入学号");
        long studentNum = input.nextLong();

        if ((studentNum + "").length() != 8) {
            System.out.println("Error");
            input.close();
            return;
        }

        long year = studentNum / 10000;
        long month = studentNum / 100 % 100;
        long day = studentNum % 100;

        if (year < 1800) {
            System.out.println("学号错误");
            input.close();
            return;
        }
        System.out.println(year + "年" + "0" + month + "期" + day + "号");
        input.close();
    }
}