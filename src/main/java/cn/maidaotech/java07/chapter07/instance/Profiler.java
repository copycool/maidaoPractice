package cn.maidaotech.java07.chapter07.instance;

import java.util.concurrent.TimeUnit;
//ThreadLocal是线程变量，在所属线程中的任何地方都可以设置或获取变量，在实际项目开发中具有广泛的应用。
// 是以ThreadLocal对象为键、任意对象为值的存储结构。
// 一个线程可以根据一个ThreadLocal对象查询到绑定在这个线程上的一个值。
// 在线程的声明周期内，可以通过set(T)方法来设置一个值，
// 通过get()方法获取到原先设置的值。
public class Profiler {
    public static void main(String[] args) throws Exception {        
        Profiler.begin();        
        TimeUnit.SECONDS.sleep(1);        
        System.out.println("Cost: " + Profiler.end() + " mills");    
    }
    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>() {        
        protected Long initialValue() {            
            return System.currentTimeMillis();        
        }    
    };
    public static final void begin() {        
        TIME_THREADLOCAL.set(System.currentTimeMillis());    
    }
    public static final long end() {        
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();    
    }
    
}
