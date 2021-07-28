package cn.maidaotech.chapter07;
/*
多线程创建，方式一:继承于Thread
          1、创建一个继承于Thread类的子类
          2、重写Thread类的run() --->>此线程将执行的操作写在run方法中
          3、创建Thread类的子类的对象
          4、通过此对象调用start
*/
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
//问题二：再启动一个线程运行上一个线程解决的问题，会抛出异常
public class ThreadTest {
    public static void main(String[] args) {
       MyThread m1 = new MyThread();
       m1.start();//启动当前线程 调用当前线程的run方法  
       System.out.println("Hello");
       for (int i = 0; i < 100; i++) {
        if(i % 2 != 0){
            System.out.println(i+"*******");
        }
       }
    }
}