package cn.maidaotech.chapter07.example06;

public class ThreadClass06 implements Runnable{  
    //  这里加上static之后，实体化多个类也依然共享此变量
    private static Integer count=0;
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
        System.out.println(Thread.currentThread().getName()+"运算结果为："+count);
    }
}