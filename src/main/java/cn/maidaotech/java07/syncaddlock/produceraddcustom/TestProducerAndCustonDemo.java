package cn.maidaotech.java07.syncaddlock.produceraddcustom;

/**
 * 线程之间的通信问题：生产者和消费者问题！ 
 * 等待唤醒，通知唤醒 线程交替执行 A B 操作同一个变量 
 * num = 0 A num+1 B num-1
 */

 //如果if变成while则会出现虚假唤醒
public class TestProducerAndCustonDemo {
    public static void main(String[] args) {
        Data2 data = new Data2();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
        
    }
}
/// 判断等待，业务，通知
class Data2{

    //定义变量
    private int number = 0;

    //+1
    public synchronized void increment() throws InterruptedException {
        if(number != 0){
            //等待
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"==>"+number);
        //通知其他线程，我+1完毕了
        this.notifyAll();
    }

    //-1
    public synchronized void decrement() throws InterruptedException {
        if(number == 0){
            //等待
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"==>"+number);
        //通知其他线程,我-1完毕了
        this.notifyAll();
    }
}