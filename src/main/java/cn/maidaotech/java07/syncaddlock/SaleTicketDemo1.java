package cn.maidaotech.java07.syncaddlock;

/**
 * 线程就是一个单独的资源类，没有任何附属的操作！
* 1、 属性、方法
 */
public class SaleTicketDemo1 {
    public static void main(String[] args) {
        // 并发：多线程操作同一个资源类, 把资源类丢入线程
        Ticket ticket = new Ticket();
        
        // @FunctionalInterface 函数式接口，jdk1.8 lambda表达式 (参数)->{ 代码 }
        new Thread(()->{
            for (int i = 1; i <40; i++) {
                ticket.sale();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 1; i < 40; i++) {
                ticket.sale();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 1; i < 40; i++) {
                ticket.sale();
            }
        },"C").start();
    }
}
//资源类  OOP
class Ticket{

    private int number = 30;

    //卖票
    public synchronized void sale(){
        if(number > 0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+(number--)+"票，还剩余"+number);
        }
    }

}