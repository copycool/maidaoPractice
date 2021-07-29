package cn.maidaotech.java07.order.seventh.practice10;

public class MyThread2Test {
    public static void main(String[] args) {
        MyThread2 t=  new MyThread2();
        new Thread(t,"窗口1").start();
        new Thread(t ,"窗口3").start();
        new Thread(t ,"窗口2").start();

     
    }
  
   
}
