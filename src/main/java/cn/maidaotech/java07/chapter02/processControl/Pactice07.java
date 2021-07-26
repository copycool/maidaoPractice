package cn.maidaotech.java07.chapter02.processControl;

public class Pactice07 {
    // 用字符“*”打印一个边长为100个*的空心正方形。
    public static void main(String[] args) {
        print(10);

    }

    // 正方形边长为n
    public static void print(int n) {
        if (n < 1) {
            System.out.println("非法输入");
        }
        for (int i = 1; i <= n ; i++) {
            if (i ==1 || i == n) {
                for (int j = 1; j <=n; j++) {
                    System.out.print("*"+" ");
                }              
            }else{
                System.out.print("*"+" ");
                for (int j = 2; j < n; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            
            
            System.out.println();
        }
        
    }
}