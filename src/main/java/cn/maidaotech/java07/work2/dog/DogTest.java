package cn.maidaotech.java07.work2.dog;

import java.util.ArrayList;
import java.util.List;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("花花", "白色", 2, "拉布拉多");
        Dog dog2 = new Dog("狗蛋", "白黑色", 1, "金毛");
        Dog dog3 = new Dog("克鲁克", "黑色", 5, "中华田园犬");
        Dog dog4 = new Dog("球球", "白色", 3, "茶杯犬");

        List<Dog> list = new ArrayList<>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        list.add(dog4);

        list.forEach((Dog dog) -> {
            System.out.println(dog);
        });
    }
}