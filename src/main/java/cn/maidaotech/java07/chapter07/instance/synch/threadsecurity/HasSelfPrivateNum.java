package cn.maidaotech.java07.chapter07.instance.synch.threadsecurity;

public class HasSelfPrivateNum {
    private int num = 0;

// 关键字synchronized取得的锁都是对象锁，而不是把一段代码或方法（函数）当作锁。
// 由此可以推导出：A线程先持有一个对象的Lock锁，B线程可以以异步的方式调用该对象中的非synchronized类型的方法。
// A线程先持有一个对象的Lock锁，B线程如果在这时调用该对象中的synchronized类型的方法则需要等待，也就是同步。
    public synchronized void addI(String username) {        
        try {            
            if (username.equals("a")) {                
                num = 100;                
                System.out.println("a set over!");                
                Thread.sleep(2000);            
            } else {                
                num = 200;                
                System.out.println("b set over");            
            }            
            System.out.println(username + " num=" + num);        
        } catch (Exception e) {            
            e.printStackTrace();        
        }    
    }
}
// 线程实例threadA设置对象的实例变量num为100，
// 却得到200的结果，与预期不符。
// 解决方案是只需要在public void addI(String username)方法前加关键字synchronized即可