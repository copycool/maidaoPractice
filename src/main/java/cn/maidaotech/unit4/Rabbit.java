package cn.maidaotech.java07.unit4;

public class Rabbit {
    public static void main(String[] args) {
        for(int i=1;i<13;i++){  
System.out.println("兔子第"+i+"个月的总数为："+f(i));
        }
    }
    public static int f(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return f(x - 1) + f(x - 2);
        }

    }
}