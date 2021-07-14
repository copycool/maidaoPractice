package cn.maidaotech.java07.chapter02;

public class PrintSquare {
    public static void main(String[] args) {
    //用字符“*”打印一个边长为10个*的空心正方形。
    for (int i = 1; i < 11; i++) {
        if (i==1||i==10){
            for (int j = 1; j < 11; j++) {
                System.out.print("*"+" ");
            }
        }else{
            System.out.print("*"+" ");
            for (int j = 2; j <10 ; j++) {
                System.out.print("  ");
            }
            System.out.print("*"+" ");
        }
        System.out.println();
}}
}