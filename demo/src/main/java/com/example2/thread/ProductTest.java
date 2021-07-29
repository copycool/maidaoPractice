package com.example2.thread;

class Clerk {
    private int produceCount = 0;

    public synchronized void produceProduct() {
        if (produceCount < 20) {
            produceCount++;
            System.out.println(Thread.currentThread().getName() + "：开始生产第" + produceCount + "个产品");
            
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumerProduct() {
        if (produceCount > 0) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + produceCount + "个产品");
            produceCount--;

            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":开始生产产品。。");
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
    
}
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }
    @Override
    public void run() {
        System.out.println(getName() + ":开始消费产品。。");
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            clerk.consumerProduct();
        }
    }
    
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer s1 = new Consumer(clerk);
        s1.setName("消费者1");

        p1.start();
        s1.start();

    }
    
}