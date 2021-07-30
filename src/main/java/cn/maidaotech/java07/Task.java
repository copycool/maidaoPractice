package cn.maidaotech.java07;


public class Task {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++)

        {
        for (int i = 0; i < 10; i++)

        {
        if (i == 5) {
        break;

        }
        System.out.println(i + "");
        }
        System.out.println(j);
        }

        int size = 100;
        for (int i = 1; i <= size; i++) {
        System.out.print("*");
        for (int j = 1; j <= size; j++) {
        if (i == 1 || i == size || j == 0 || j == size)
        System.out.print("*");
        else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
        System.out.println();// 正方形

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d*%d=%2d", i, j, i * j);
            }
            System.out.println();
            // 9*9乘法表
        }
       
       
    
        
    }
  

}