package cn.maidaotech.java07.chapter07.instance.hole;

public class Test extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("run");
    }
    public static void main(String[] args) {
        Test test = new Test();
        // test.start();//开启线程 PK main线程,线程赛跑
        test.run();//对象调用普通方法的调用，按顺序执行
        System.out.println("main");
    }
}