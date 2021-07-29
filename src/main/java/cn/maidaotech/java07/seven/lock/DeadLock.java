package cn.maidaotech.java07.seven.lock;

public class DeadLock implements Runnable {
    int flag;
    static Object obj1=new Object();
    static Object obj2=new Object();   
    public DeadLock(int flag){
        this.flag=flag;
    } 
    @Override
    public void run() {
       if (flag==1) {
            synchronized(obj1){
               System.out.println(Thread.currentThread().getName()+"已获取obj1,正在请求obj2");
               try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                }
                synchronized(obj2){
                    System.out.println(Thread.currentThread().getName()+"已获取obj1和obj2");
            }
           }
       } if(flag==2){
        synchronized(obj2){
            System.out.println(Thread.currentThread().getName()+"已获取obj2,正在请求obj1");
            try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {            
             e.printStackTrace();
             }
             synchronized(obj1){
                 System.out.println(Thread.currentThread().getName()+"已获取obj1和obj2");        
        }
    }           
       }       
    }   
}
