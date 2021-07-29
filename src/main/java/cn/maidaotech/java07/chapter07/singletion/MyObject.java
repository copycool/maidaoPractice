package cn.maidaotech.java07.chapter07.singletion;

//安全的单例模式
public class MyObject {
    private static volatile MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {

        if (myObject == null) {

            synchronized (MyObject.class) { // 只在创建的时候加一次锁

                if (myObject == null) {
                    myObject = new MyObject();
                }

            }
        }
        return myObject;
    }
}
