package cn.maidaotech.java07.chapter07.Practice08;

public class Test {
   public static void main(String[] args) {
       Object a = new Object();
       Object b = new Object();

       Thread threadA = new Thread(new ThreadA(a, b),"threadA"); 
       Thread threadB = new Thread(new ThreadB(a, b),"threadB");

       threadA.start();
       threadB.start();
   };
}