package com.example.seven;

public class Bank extends Thread{
    private static int money = 0;
    private int a = 20;
    @Override
    public void run() {
        if (money == 0) {
            System.out.println("存了"+a+"元"); 
            money=money+a; 
        }else{
            System.out.println("取了"+a+"元");
        }
    }
    public static void main(String[] args) {
        Bank A = new Bank();
        Bank B = new Bank();

        A.start();
        B.start();
    }
}