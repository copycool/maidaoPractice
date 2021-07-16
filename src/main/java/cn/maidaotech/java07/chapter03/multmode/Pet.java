package cn.maidaotech.java07.chapter03.multmode;

public abstract class Pet implements Animal{
    public abstract void eat();

    public void play() {
        System.out.println("陪伴玩乐");
    }
}
