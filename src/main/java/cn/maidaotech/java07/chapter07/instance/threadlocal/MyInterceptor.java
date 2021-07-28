package cn.maidaotech.java07.chapter07.instance.threadlocal;

public class MyInterceptor {
    private ThreadLocal threadLocal;
    public MyInterceptor(ThreadLocal threadLocal) {
        this.threadLocal = threadLocal;
    }
    public void setToLocal(Long time) {        
        threadLocal.set(time);    
    }
}


