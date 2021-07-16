package cn.maidaitech.shui966.Char3;
/*六
建立一个人类Person和学生类Student。
功能如下：Person中含有4个私有成员变量姓名（name）、地址（address）、性别（sex）和年龄（age）
用构造函数初始化这四个属性
以及一个方法message输出这些属性。
 */
public class person {
    private String name;
    private String adress;
    private String sex;
    private Integer age;
    public person(){

    }
    public person(String name,String address,String sex,Integer age){
        this.name=name;
        this.adress=address;
        this.sex=sex;
        this.age=age;
    }
    public void message(){
        System.out.println("名字： "+name+" 地址： "+adress+" 性别： "+sex+" 年龄："+age);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAdress() {
        return adress;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    
    
}