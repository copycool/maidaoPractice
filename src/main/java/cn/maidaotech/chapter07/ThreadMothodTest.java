package cn.maidaotech.chapter07;

/*
1、start（）：启动当前线程；调用当前线程run方法
2、run（）
3、currentThread():静态方法，返回执行当前代码的线程
4、getName（） 获取当前线程的名字
5、setName（）：设置当前线程的名字
6、yield（）：释放当前cpu的执行权 
7、join（）: 在线程A中调用线程B的join方法，此时线程A进入阻塞状态，直到线程B完全执行完之后。
8、stop方法 ：已过时 执行此方法，强制结束当前线程
9、sleep(long millitime) 让线程睡眠指定的millitime毫秒
10、isLive 判断线程是否存活 

线程的优先级：
1、 MAX_PRIORITY :10
   MIN_PRIORITY: 1
   MORM_PRIORITY:5
2、如何获取和设置当前线程的优先级
  getPriority（）：获取
  setPriority（）：修改
  高优先级的线程会抢占低优先级cpu的执行权，但是从概率上讲，并不会高优先级全部执行完之后，
  再执行低优先级
*/
public class ThreadMothodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread();
        h1.setName("线程1");
        h1.start();
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        h1.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
           /* if (i == 20) {
                try {
                    h1.join();//
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }*/
        }
    }
}

class HelloThread extends Thread {
    // public HelloThread(String name){//通过构造器给线程命名
    // super(name);
    // }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
               /* try {
                    sleep(10);//睡眠1秒
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                */
                System.out.println(Thread.currentThread().getName()+":"+ Thread.currentThread().getPriority()+":"+ i);
            }
        }
    }
}