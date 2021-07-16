package cn.maidaotech.java07.work3;

import java.util.ArrayList;
import java.util.List;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog("小黑", "黑色", "1");
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("黑八", "黑", "3");
        List<Dog> list = new ArrayList<Dog>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        for (int i = 0; i < list.size(); i++) {
            // System.out.print(list.get(i).output());
            list.get(i).output();

        }
    }
}
