package cn.maidaotech.java07.chapter03;

// 设计一个 Dog 类，有名字，颜色，年龄等属性，
// 定义构造方法来初始化类的这些属性，定义 一个方法输出 Dog 信息。
// 编写测试类，创建一个 Dog 类型的数组，遍历数组输出元素信息。
public class PrintDog {
public static void main(String[] args) {
    Dog dog1 = new PrintDog().new Dog("海豹","咖色",8);
    dog1.printMsg();
    Dog[] dogs = new Dog[6];
    dogs[0] = new PrintDog().new Dog("小一","橙色",3);
    dogs[1] = new PrintDog().new Dog("小而","黑色",3);
    dogs[2] = new PrintDog().new Dog("小散","黑色",3);
    dogs[3] = new PrintDog().new Dog("小斯","黑色",3);
    dogs[4] = new PrintDog().new Dog("小物","黑色",3);
    dogs[5] = new PrintDog().new Dog("小留","黑色",3);
    for(Dog item: dogs){
        System.out.println(item.toString());
    }}
    public class Dog{
        String name;
        String color;
        int age;

        public Dog(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public Dog() {
        }
        public void printMsg(){
            System.out.println("本汪姓名："+this.name);
            System.out.println("本汪体色："+this.color);
            System.out.println("本汪年龄："+this.age);
        }

        @Override
        public String toString() {
            return "本汪 [姓名：" + name + ", 体色：" + color + ", 年龄：" + age + "]";
        }
        
    }
}