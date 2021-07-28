package cn.maidaotech.java07.chapter07.Practice06;

public class Practice06{
    public static void main(String[] args) {
        ThreadTest a=new ThreadTest();
        Thread b1 =new Thread(a);
        Thread b2 =new Thread(a);
        Thread b3=new Thread(a);
        Thread b4 =new Thread(a);
        Thread b5=new Thread(a);
        b1.setName("线程1");
        b1.start();
        b2.setName("线程2");
        b2.start();
        b3.setName("线程3");
        b3.start();
        b4.setName("线程4");
        b4.start();
        b5.setName("线程5");
        b5.start();
    
}
}
