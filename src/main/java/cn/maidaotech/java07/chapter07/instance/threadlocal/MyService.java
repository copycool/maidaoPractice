package cn.maidaotech.java07.chapter07.instance.threadlocal;
//MyService提供从ThreadLocal中获取值的方法

public class MyService {
    private ThreadLocal threadLocal;    
    public MyService(ThreadLocal threadLocal) {        
        this.threadLocal = threadLocal;    
    }    
    public Long getFromLocal() throws Exception {        
        Object obj = threadLocal.get();        
        if (obj instanceof Long) {            
            return Long.valueOf(String.valueOf(obj));        
        }        
        throw new Exception("Data not found");    
    }
}