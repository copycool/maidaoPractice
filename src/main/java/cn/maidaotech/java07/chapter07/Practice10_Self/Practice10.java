package cn.maidaotech.java07.chapter07.Practice10_Self;



public class Practice10 {
    public static void main(String[] args) throws InterruptedException {
        Mythread10 ser = new Mythread10();
        Thread platform1 = new Thread(ser, "站台1");
        Thread platform2 = new Thread(ser, "站台2");
        Thread platform3 = new Thread(ser, "站台3");
        platform1.start();
        platform2.start();
        platform3.start();
        platform1.join();
        platform2.join();
        platform3.join();
        ser.getCount();
        ser.stop();
        System.out.println("售卖结束");
        
         
    }
}
