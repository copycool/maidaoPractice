package com.example2.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class NumThread implements Callable{
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try{
            Object sum = futureTask.get();
            
            System.out.println("总和为："+ sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}