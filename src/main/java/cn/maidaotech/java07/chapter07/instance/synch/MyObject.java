package cn.maidaotech.java07.chapter07.instance.synch;

public class MyObject {
    private static MyObject myObject;    
    private MyObject() {    
    }    
    public synchronized static MyObject getInstance() {        
        try {            
            if (myObject == null) {                
                //模拟在创建对象之前做一些准备的工作                
                Thread.sleep(3000);                
                myObject = new MyObject();            
            }        
        } catch (Exception e) {            
            e.printStackTrace();        
        }        
        return myObject;    
    }
}
// getInstance方法加入同步synchronized关键字得到相同实例的对象，
// 但这种方法的运行效率非常低下，是同步运行的，
// 下一个线程想要取得对象，则必须等上一个线程释放锁之后，
// 才可以继续执行。