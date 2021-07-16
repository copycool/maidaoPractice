package cn.maidaotech.chapter03.exampletest;

import cn.maidaotech.chapter03.example.Dog;

public class DogTest {
    public static void main(String[] args) {
        /*
         * Dog[] dogs = new Dog[1];//这里只是开辟了数组空间、里面没有对象是null dogs[0]= new
         * Dog();//需要这样，往数组空间里面填对象 这里前面不用Dog了，因为已经规定了类型 
         * dogs[0].setName("啊呜");dogs[0].setColor("color"); dogs[0].setAge(11);
         */
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("雪绒", "白色", 13);
        dogs[1] = new Dog("烈焰犬", "红色", 13);
        dogs[2] = new Dog("护主犬", "棕色", 13);
        dogs[3] = new Dog("阿奇", "斑点", 13);
        dogs[4] = new Dog("小班", "灰色", 13);
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "号狗狗的信息为：" + dogs[i].dogMessage());
        }

    }
}