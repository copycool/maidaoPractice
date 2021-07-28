package cn.maidaotech.java07.chapter07.instance.factorythread;

public class Test {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        FactorialThread thread = new FactorialThread(10);
        thread.start();
        int s=10;
        for (int i = 0; i < 10; i++) {
            s+=i;
        }
        System.out.println("main thread ends");
    }
}
    