package cn.maidaotech.java07.ch02;

public class Stunumber {
    public static void main(String[] args) {
        int x=20190112;
        int a=x/10000;
        int b=x%10000/100;
        int c=x%10000%100;
      
        System.out.print(a+"年");
        System.out.print(b+"期");
    System.out.print(c+"号");
    }
    
    }