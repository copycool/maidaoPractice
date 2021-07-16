package cn.maidaotech.unit3.Test;


public class DogTest {
    public static void main(String[] args) {
        Dog d1=new Dog("法斗", "棕色", "12");
        Dog d2=new Dog("哈士奇", "白灰", "10");
        Dog d3=new Dog("茶杯犬", "白色", "6");
        Dog [] dogs={d1,d2,d3};
        for (int i = 0; i < dogs.length; i++) {
                outPut(dogs[i]);
                System.out.println();
        }
    }
    public static void outPut(Dog dog) {
        System.out.println("名字：" + dog.getName());
        System.out.println("颜色：" + dog.getColor());
        System.out.println("年龄：" + dog.getAge());

    }

}
