package cn.maidaotech.java07;

import java.util.Arrays;

/*
设计一个Dog类，有名字，颜色，年龄等属性，定义构造方法来初始化类的这些属性，
 定义一个方法输出Dog信息。编写测试类，创建一个Dog类型的数组，遍历数组输出元素信息。
*/
public class DogTest {
    private String name;
    private String color;
    private int age;
    public static void main(String[] args) {
        DogTest test = new DogTest("花花","白色",2);
        System.out.println("名字："+test.getName() + "  "+"颜色："+  test.getColor() + "  "+
        "年龄:"+  test.getAge()+"岁");
        DogTest[] tests = new DogTest[]{
            new DogTest("花花","白色",2)
        };
        System.out.println(new DogTest("花花","白色",2));
        System.out.println(Arrays.toString(tests));
    }
    @Override
    public String toString(){//重写toString
        return "["+"  名字： "+ name +" 颜色："+ color +" 年龄为 "+ age +" ]";
    }

    public DogTest() {

    }
    
    public DogTest(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    
}