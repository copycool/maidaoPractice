package cn.maidaotech.java07.chapter07.instance.synch;

public class MyObject2 {
    private static MyObject2 myObject;    
    private MyObject2(){};  
    public static MyObject2 getInstance() {
        try {         
            synchronized (MyObject2.class) {   
                if (myObject == null) {                
                    //模拟在创建对象之前做一些准备的工作                
                    Thread.sleep(3000);                
                    myObject = new MyObject2();            
                }        
            } 
        }catch (Exception e) {            
            e.printStackTrace();        
        }        
        return myObject;    
    }
}
// 此种写法等同于public synchronized static MyObject getInstance()的写法，
// 效率一样很低，全部代码被上锁。
