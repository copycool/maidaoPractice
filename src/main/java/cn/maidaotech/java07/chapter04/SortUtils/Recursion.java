package cn.maidaotech.java07.chapter04.SortUtils;

public class Recursion {
    //递归
    public static void main(String[] args) {
        System.out.println( recursion(3));
    }
    public static int recursion(int m){
        if (m==1) {
            return 1;
        }
        return recursion(m-1)*m;
    }
}