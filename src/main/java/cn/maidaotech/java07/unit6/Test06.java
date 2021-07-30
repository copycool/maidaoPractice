package cn.maidaotech.java07.unit6;

public class Test06 extends Thread {
    private Integer num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            num++;
        }
        System.out.println(Thread.currentThread().getName() + "运算了：" + num + "次");
    }

    public static void main(String[] args) {

        Test06 t1 = new Test06();
        Test06 t2 = new Test06();
        Test06 t3 = new Test06();
        Test06 t4 = new Test06();
        Test06 t5 = new Test06();
        t1.setName("t1");
        t1.start();
        t2.setName("t2");
        t2.start();
        t3.setName("t3");
        t3.start();
        t4.setName("t4");
        t4.start();
        t5.setName("t5");
        t5.start();
    }
}