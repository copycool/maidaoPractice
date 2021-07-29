package cn.maidaotech.java07.chapter07.myInterceptor;

public class Test {
    public static void main(String[] args) throws Exception {
        Long now = System.currentTimeMillis();
        ThreadLocal<Long> local = new ThreadLocal<>();   
        MyInterceptor interceptor = new MyInterceptor(local);
        MyService service = new MyService(local);

        //将时间戳放入ThreadLocal
        interceptor.setToLocal(now);
        //从ThreadLocal中取出存入的时间戳
        Long value = service.getFromLocal();
        System.out.println(now.equals(value));
    }
}