package cn.maidaotech.java07.chapter07.seatwork.singleton;

public class MyObject {
    //加上可见性
    private static volatile MyObject myObject;

    // 单例模式构造函数私有化
    private MyObject() {

    }

    public static MyObject getInstance() {
        // 线程A判断myobject为空 线程B也判断myobject为空 A先锁住 判断为空创建object B在锁住此时myobject不为空了
        //也可能B此时不知道myobject已经改了 所以给myobject加上可见性volatile 就可保证b可以看到myobject改了
        if (myObject == null) {
            synchronized (MyObject.class) {
                if (myObject == null) {
                    myObject = new MyObject();
                }
            }

        }
        return myObject;
    }

}
