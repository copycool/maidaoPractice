package cn.maidaitech.shui966.Char3;
/*四
设计一个Dog类，有名字，颜色，年龄等属性
定义构造方法来初始化类的这些属性，
定义一个方法输出Dog信息。编写测试类
创建一个Dog类型的数组，遍历数组输出元素信息。 */
public class Dog {
    private String name;
    private String color;
    private Integer age;

    public Dog(){

    }
    public Dog(String name,String color,Integer age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void print(){
        System.out.println("名字："+name+" 颜色： "+color+" 年龄："+age);
    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.getAge();
    }

}