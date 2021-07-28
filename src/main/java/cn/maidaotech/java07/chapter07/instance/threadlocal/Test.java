package cn.maidaotech.java07.chapter07.instance.threadlocal;
//ThreadLocal是线程变量，在所属线程中的任何地方都可以设置或获取变量，在实际项目开发中具有广泛的应用。
//在一个类中向ThreadLocal存入变量，然后在另一个类中获取存入的变量，示例如下：
public class Test {
    public static void main(String[] args) {        
        try {            
            Long now = System.currentTimeMillis();            
            ThreadLocal<Long> local = new ThreadLocal<>();   
            //给某一个类赋值         
            MyInterceptor interceptor = new MyInterceptor(local); 

            MyService service = new MyService(local);            
            //将时间戳放入ThreadLocal            
            interceptor.setToLocal(now);             
            //从ThreadLocal中取出存入的时间戳            
            Long value = service.getFromLocal();             
            System.out.println(now.equals(value));        
        } catch (Exception e) {            
            e.printStackTrace();        
        }    
    }
}