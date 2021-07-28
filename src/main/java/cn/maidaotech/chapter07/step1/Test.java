package cn.maidaotech.chapter07.step1;

//step1实现的是对线程初步创建
public class Test {
    public static void main(String[] args) {
        ThreadClassOne t1 = new ThreadClassOne();

        if (t1 instanceof Thread) {
            System.out.println("ThreadClassOne线程定义正确");
        } else {
            System.out.println("ThreadClassOne线程定义有误，该类需要继承Thread");
        }

        ThreadClassTwo t2 = new ThreadClassTwo();
        if (t2 instanceof Runnable) {
            System.out.println("ThreadClassTwo线程定义正确");
        } else {
            System.out.println("ThreadClassTwo线程定义有误，该类需要实现Runnable接口");
        }
        t1.run();
        t2.run();
    }
}
