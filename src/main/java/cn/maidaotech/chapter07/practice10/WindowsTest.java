package cn.maidaotech.chapter07.practice10;
/**
 * 三个窗口同时出售100张票：票抽象为类，拥有票号等属性站台抽象为线程类同一张票不能重复销售
 */
public class WindowsTest {
    public static void main(String[] args) {
       Window w1 = new Window();
       Thread t1 = new Thread(w1,"窗口1");
       Thread t2 = new Thread(w1,"窗口2");
       Thread t3 = new Thread(w1,"窗口3");
       t1.start();
       t2.start();
       t3.start();

    }
}
class Window extends Thread{
    private static int ticket = 100;
     @Override
     public void run() {
         synchronized(this){
            while(ticket > 0){
                 System.out.println(Thread.currentThread().getName()+"当前余票为"+ticket--);
             }
         }
     }
}