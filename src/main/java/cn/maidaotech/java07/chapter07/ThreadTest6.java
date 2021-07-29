package cn.maidaotech.java07.chapter07;

/*
*创建一个线程类，该类有一个整型的实例变量，默认为0。
*在run方法中对变量执行1000次自增运算，并打印变量值。
*然后创建5个该类的实例线程，调用执行，观察变量的最终结果。
*/
public class ThreadTest6 {
    private int come = 0;   //一个整型实例变量默认值为0
    
    public static void main(String[] agrs) {
        ThreadTest6 test = new ThreadTest6(); 
        NumberThread test01 = test.new NumberThread();
        NumberThread test02 = test.new NumberThread();
        NumberThread test03 = test.new NumberThread();
        NumberThread test04 = test.new NumberThread();
        NumberThread test05 = test.new NumberThread();
        test01.start();
        test02.start();
        test03.start();
        test04.start();
        test05.start();
        System.out.println(test.come);
    }
    public class NumberThread extends Thread {

        @Override
        public void run() {
            for (int j = 0; j < 1000; j++) {
                come++;
            }
        }
    }

}
