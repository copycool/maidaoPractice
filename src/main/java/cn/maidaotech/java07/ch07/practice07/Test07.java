package cn.maidaotech.java07.ch07.practice07;
// 给定 count 为 0，创建 5 个线程并发自增运算到 1000

public class Test07 implements Runnable {
    private static  int count = 0;
    private  static int i = 0;
  
    @Override
    public void run() {
        while (count < 1000) {
            count++;
               i++;
        }
    
        // System.out.println("count---->"+count);
        
        StringBuffer t = new StringBuffer();
        t.append(Thread.currentThread().getName()).append("执行了").append(i).append("次");
        System.out.println(t.toString());
    }
}
class test {
    public static void main(String[] args) {
        Test07 t = new Test07();
        for(int i = 0; i<5; i++){

            new Thread(t).start();

        }
    }
}