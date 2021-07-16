package cn.maidaotech.java07;

public class Person1 {
    public static void main(String[] args) {
        Person a = new Person();
        System.out.println(a.human());
}
} 
  class Person{
   private String name;
   private String address;
   private String sex;
   private int age;
    public Person(){
      // this.name=name;
      // this.address=address;
      // this.sex=sex;
      // this.age=age;
    }
    // public String getName(){
    //   return this.name;
    // }
    // public String getAddres(){
    //   return this.address;
    // }
    // public String sex(){
    //   return this.sex;
    // }
    // public int age(){
    //   return this.age;
    // }
    public String human(){
      return  name+ address+ sex+ age;
}
}


// Person 中含有 4 个私有成员变量姓名（name）、 地址（address）、性别（sex）和年龄（age），
// 用构造函数初始化这四个属性，以及一个方法 输出这些属性。