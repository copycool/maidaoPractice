package cn.maidaotech.java07.work7.test6;

// 创建一个线程类，该类有一个整型的实例变量，默认为0。
// 在run方法中对变量执行1000次自增运算，并打印变量值。
// 然后创建5个该类的实例线程，
// 调用执行，观察变量的最终结果
public class RunnableDemo implements Runnable {
    int j = 0;

    public static void main(String[] args) {
        RunnableDemo ru = new RunnableDemo();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(ru);
            thread.start();
        }
    }

    @Override
    public void run() {

        // TODO Auto-generated method stub
        for (int i = 0; i < 1000; i++) {
            j++;
        }
        System.out.println(j);
    }

}

