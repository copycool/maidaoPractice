package cn.maidaotech.java07.chapter07.myInterceptor;

//在ThreadLocal中存入值
public class MyInterceptor {
    private ThreadLocal threadLocal;

    public MyInterceptor (ThreadLocal threadLocal){
        this.threadLocal = threadLocal;
    }

    public void setToLocal(Long time){
        threadLocal.set(time);
    }
}