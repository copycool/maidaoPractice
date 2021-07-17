package cn.maidaotech.java07;
//设计一个 Dog 类，有名字，颜色，年龄等属性，定义构造方法来初始化类的这些属性， 
//定义 一个方法输出 Dog 信息。编写测试类，创建一个 Dog 类型的数组，遍历数组输出元素信息。
public class DogTest {
    public static void main(String[] args) {
        Dog a = new Dog("tom  ","黑色  ","12  ");
        // System.out.println(a.name);
        // System.out.println(a.coloer);
        // System.out.println(a.age);
        System.out.println(a.dogOut());
}
}
    class Dog{
        String name;
        String coloer;
        String age;
        public Dog(String name,String coloer,String age){
            this.name = name;
            this.coloer = coloer;
            this.age = age;
        }
        public String dogOut(){
              
            String[] dog = new String[]{name,coloer,age};
            StringBuilder builder = new StringBuilder();
            for(int i = 0;i < dog.length;i++){
                builder.append(dog[i]);
            }
            return builder.toString();
            
        }
       
    }
 