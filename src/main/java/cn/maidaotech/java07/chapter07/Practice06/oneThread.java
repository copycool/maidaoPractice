package cn.maidaotech.java07.chapter07.Practice06;

public class  oneThread extends Thread{
    int sum = 0;
    @Override
    public void run() {
        // TODO Auto-generated method stub
     for (int i = 0; i <1000; i++) {
        sum++;
     }
     System.out.println(Thread.currentThread().getName()+">>>"+sum);
    }
    
}
