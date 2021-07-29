package com.example.seven;

class Counter {
    private int money = 0;

    public synchronized void aBank() {
        if (money < 20) {
            money++;
            System.out.println(Thread.currentThread().getName() + ":开始存钱" + money + "元");
            
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

    public synchronized void bBank() {
        if (money > 0) {
            System.out.println(Thread.currentThread().getName() + ":开始取钱" + money + "元");
            money--;

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

class A extends Thread {
    private Counter counter;

    public A(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(getName() + "存钱" + counter + "元");
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter.aBank();
        }
    }
}

class B extends Thread {
    
	private Counter counter;

    public B(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(getName() + "取钱" + counter + "元");
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
               }
            counter.bBank();
        }
    }
}

public class Bank  {
    public static void main(String[] args) {
        Counter counter = new Counter();
        A a = new A(counter);
       
        B b = new B(counter);

        a.setName("存钱者");
        b.setName("取钱者");

        a.start();
        b.start();
    }
}