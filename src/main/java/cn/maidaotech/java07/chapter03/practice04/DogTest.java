package cn.maidaotech.java07.chapter03.practice04;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("旺财", "白色", 3);
        dogs[1] = new Dog("毛球", "粉色", 1);
        dogs[2] = new Dog("富贵", "换色", 2);

        for (Dog dog : dogs) {
            System.out.println(dog.message());
        }
    }
}