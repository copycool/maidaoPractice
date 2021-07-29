package cn.maidaotech.java07.chapter07.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class MyObject {

    private static volatile MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
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
