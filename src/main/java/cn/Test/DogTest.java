package cn.Test;

import cn.maidaotech.java07.chapter03.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("柯基", "黄色", 1);
        Dog d2 = new Dog("哈士奇", "黑白色", 3); 
        Dog d3 = new Dog("金毛", "蓝色", 2);
        Dog[] dogs = {d1,d2,d3};
        // Dog[] dogs = {new Dog("柯基", "黄色", 1),new Dog("哈士奇", "黑白色", 3),new Dog("金毛", "蓝色", 2)};
        for (int i = 0; i < dogs.length; i++) {
            Dog.outPut(dogs[i]);
            System.out.println();
        }
        
}
}
