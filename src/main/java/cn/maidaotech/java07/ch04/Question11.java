package cn.maidaotech.java07.ch04;

public class Question11 {
    public static void main(String[] args) {
        int month=month(12);
        System.out.println(month);
    }

    public static int month(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return month(n-1)+month(n-2);
        }
    }
}
