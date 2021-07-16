package cn.maidaotech.java07.chapter03.multmode;

public class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}
