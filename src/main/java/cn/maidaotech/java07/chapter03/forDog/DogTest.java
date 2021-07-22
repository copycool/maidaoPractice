package cn.maidaotech.java07.chapter03.forDog;
/**
 * 设计一个Dog类，有名字，颜色，年龄等属性，定义构造方法来初始化类的这些属性，
 * 定义一个方法输出Dog信息。编写测试类，创建一个Dog类型的数组，遍历数组输出元素信息。
 */
public class DogTest {
    public static void main(String[] args) {
        Dog[] dog = new Dog[3];
        dog[0] = new Dog("xiaoming",10,"白色");
        dog[1] = new Dog("xiaoming",10,"白色");
        dog[2] = new Dog("xiaoming",10,"白色");
        for (Dog dog2 : dog) {
            System.out.println(dog2.toString());
        }
    }
    
}
