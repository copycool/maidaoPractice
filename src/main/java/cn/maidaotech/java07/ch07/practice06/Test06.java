package cn.maidaotech.java07.ch07.practice06;

// 创建一个线程类，该类有一个整型的实例变量，默认为 0。
// 在 run 方法中对变量执行 1000 次自增运算，并打印变量值。
// 然后创建 5 个该类的实例线程，调用执行，观察变量的最终结果
public class Test06 implements Runnable {
    private static int num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            num++;
        }

        System.out.println(Thread.currentThread().getName()+ "num为 " + num);

    }
}

class test {
    public static void main(String[] args) {
       
        Test06 t = new Test06();

         for (int num = 0; num < 5; num++) {
            new Thread(t).start();
    }
}
}