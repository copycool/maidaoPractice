package cn.maidaotech.java07.chapter3.question6;

public class Student extends Person{
    private Double mathEmatics;
    private Double chineseEmatics;
    public Student(){

    }
    public Student(String name,String address,String sex,Integer age,Double mathematics,Double chineseematics){
        super(name, address, sex, age);
        this.mathEmatics = mathematics;
        this.chineseEmatics = chineseematics;
    }

    public String message() {
        return ("名字： " + getName() + " 地址： " + getAdress() + " 性别： " + getSex() + " 年龄：" + getAge() + " 数学成绩："
                + mathEmatics + " 语文成绩：" + chineseEmatics);

        // System.out.println("名字： "+getName()+" 地址： "+getAdress()+" 性别： "+getSex()+"
        // 年龄："+getAge()+" 数学成绩："+mathematics+" 语文成绩："+chineseematics);
    }

    public void setMathematics(double mathematics) {
        this.mathEmatics = mathematics;
    }

    public double getMathematics() {
        return mathEmatics;
    }

    public void setChineseematics(double chineseematics) {
        this.chineseEmatics = chineseematics;
    }

    public double getChineseematics() {
        return chineseEmatics;
    }
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu1=new Student("小明","河南","男",96,180.3,160.6);
        System.out.println(stu.message());
        System.out.println(stu1.message());;
    }
}