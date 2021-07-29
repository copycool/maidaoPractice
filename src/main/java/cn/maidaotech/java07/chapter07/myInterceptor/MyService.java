package cn.maidaotech.java07.chapter07.myInterceptor;
 
//从ThreadLocal 中获取值
public class MyService extends ThreadLocal {
    private ThreadLocal threadLocal;

    public MyService(ThreadLocal threadLocal){
        this.threadLocal = threadLocal;
    }

    public Long getFromLocal() throws Exception {
        Object obj = threadLocal.get();
        if (obj instanceof Long) {
            return Long.valueOf(String.valueOf(obj));
        }
        throw new Exception("Date not found");
        
    }
}