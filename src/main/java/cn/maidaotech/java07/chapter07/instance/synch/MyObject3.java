package cn.maidaotech.java07.chapter07.instance.synch;

public class MyObject3 {
    private static MyObject3 myObject;
    private MyObject3(){
    }
    public static MyObject3 getInstance() {        
        try {            
            if (myObject == null) {                
                //模拟在创建对象之前做一些准备的工作                
                Thread.sleep(3000);                
                synchronized (MyObject3.class) {                    
                    myObject = new MyObject3();                
                }            
            }        
        } catch (Exception e) {            
            e.printStackTrace();        
        }        
        return myObject;    
    }   
}