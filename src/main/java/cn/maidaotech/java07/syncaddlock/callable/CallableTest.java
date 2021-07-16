package cn.maidaotech.java07.syncaddlock.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyThread thread =new MyThread();
        FutureTask futureTask = new FutureTask<>(thread);//适配类
        new Thread(futureTask,"A").start();
        new Thread(futureTask,"B").start();// 结果会被缓存，效率高
        Integer o =  (Integer) futureTask.get();//这个get 方法可能会产生阻塞！把他放到最后
        // 或者使用异步通信来处理！
        System.out.println(o);
    }   
}
class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("call()");
        //耗时操作
        return 1024;
    }
    
}