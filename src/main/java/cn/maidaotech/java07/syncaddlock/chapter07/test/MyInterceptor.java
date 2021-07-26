package cn.maidaotech.java07.syncaddlock.chapter07.test;

public class MyInterceptor {

    private ThreadLocal threadLocal;

    public MyInterceptor(ThreadLocal threadLocal){
        this.threadLocal = threadLocal;
    }

    public void setThreadLocal(Long time){
        threadLocal.set(time);
    }
}
//MyService 提供从 ThreadLocal 中获取值的方法
class MyService extends ThreadLocal {
    private ThreadLocal threadLocal;

    public MyService(ThreadLocal threadLocal){
        this.threadLocal = threadLocal;
    }


    public Long getFromLocal() throws Exception {
        Object obj = threadLocal.get();
        if (obj instanceof Long){
            return Long.valueOf(obj.toString());
        }
        throw new Exception("data not fund");
    }
}