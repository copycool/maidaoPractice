package cn.maidaotech.java07.chapter04.Work;

public class Practice11 {
    private static int f(int x){
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return f(x - 1) + f(x - 2);
        }

    }
    public static void main(String[] args) {
        
        System.out.println("一年后有"+f(12)+"对");
    }
}
