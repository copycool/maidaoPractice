package cn.maidaotech.java07.chapter03.multmode;

public class MultiMode {

    public static void main(String[] args) {
        show(new Dog());
        show(new Cat());
    }

    public static void show(Animal a) {
        a.eat();
        // 类型判断
        if (a instanceof Cat) { // 猫做的事情
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog c = (Dog) a;
            c.work();
        }
    }
}