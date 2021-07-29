package cn.maidaotech.java07.chapter07.Practice06;

public class oneThread extends Thread{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        int sum = 0;
     for (int i = 0; i <1000; i++) {
        sum++;
     }
     System.out.println(Thread.currentThread().getName()+">>>"+sum);
    }
    
}
