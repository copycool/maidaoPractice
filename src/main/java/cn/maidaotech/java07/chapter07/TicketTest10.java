package cn.maidaotech.java07.chapter07;
/**三个窗口同时出售100张票：
票抽象为类，拥有票号等属性
站台抽象为线程类
同一张票不能重复销售
*/
public class TicketTest10 extends Thread{
    static int tick = 100;
    static Object ob = "aa";
    public TicketTest10(String name) {
        super(name);
       }


    public static void main(String[] args) {
         TicketTest10 station1 = new TicketTest10("窗口1");
         TicketTest10 station2 = new TicketTest10("窗口2");
         TicketTest10 station3 = new TicketTest10("窗口3");
         station1.start();
         station2.start();
         station3.start();
    }
   @Override
   public void run() {
       while (tick > 0) {
           synchronized (ob) {//锁static,就是锁类，锁类的run方法
               if (tick > 0) {
                   System.out.println(getName() + "卖出了第" + tick + "张票");
                   tick--;
               } else {
                   System.out.println("票卖完了");
               }
           }
           try {
                sleep(1000);//休息一秒,让步，线程上下文切换
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}