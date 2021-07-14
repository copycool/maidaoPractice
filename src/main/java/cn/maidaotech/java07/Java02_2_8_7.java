package cn.maidaotech.java07;

import java.util.Scanner;
public class Java02_2_8_7 {
    public static void main(final String[] args) {
        int max=0;
        int min=0;
        final Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数");
         int one = input.nextInt();
         System.out.println("请输入第二个数");
         int two=input.nextInt();
         System.out.println("请输入第三个数");
         int three=input.nextInt();
          max=(one>two)?one:two;
          max=(max>three)? max:three;
          min=(one<two)?one:two;
          min=(min<three)?min:three;
         System.out.println("最大数是"+max);
         System.out.println("最小数是"+min);
    }

     

}
