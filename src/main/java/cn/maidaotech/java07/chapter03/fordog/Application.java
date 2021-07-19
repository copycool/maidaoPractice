package cn.maidaotech.java07.chapter03.fordog;

//第三章   第四题 设计一个Dog类，有名字，颜色，年龄等属性
//创建一个Dog类型的数组，遍历数组输出元素信息
public class Application {
    public static void main(String[] args) {
        Dog[] dog = new Dog[3];
        dog[0] = new Dog("大白",10,"蓝色");
        dog[1] = new Dog("小牛",20,"褐色");
        dog[2] = new Dog("小牌",30,"红色");
        for (Dog dog2 :dog) {
            System.out.println(dog2.toString());
        }  
    }
}
