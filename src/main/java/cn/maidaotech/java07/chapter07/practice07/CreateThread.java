package cn.maidaotech.java07.chapter07.practice07;

public class CreateThread implements Runnable{
    private static int count = 0;
    
    @Override
    public void run() {       
        while (true) {
            synchronized(this){
                if(count >= 1000){
                    break;
                }  
            System.out.println(Thread.currentThread().getName() + ":" + ++count);
            }

        }
        
        
    }
    
}