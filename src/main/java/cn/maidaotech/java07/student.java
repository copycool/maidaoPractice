package cn.maidaitech.shui966.Char3;
/*六
Student类继承Person类
并增加成员数学(math)成绩和英语(english)成绩
用一个6个参数的构造函数初始化属性
编写message方法用于显示6个属性。*/
public class student extends person{
    private double mathematics;
    private double chineseematics;
    public student(){

    }
    public student(String name,String address,String sex,Integer age,double mathematics,double chineseematics){
        super(name, address, sex, age);
        this.mathematics=mathematics;
        this.chineseematics=chineseematics;
    }
    
   public void message() {
        System.out.println("名字： "+getName()+" 地址： "+getAdress()+" 性别： "+getSex()+" 年龄："+getAge()+" 数学成绩："+mathematics+" 语文成绩："+chineseematics);
    }
    public void setMathematics(double mathematics) {
        this.mathematics = mathematics;
    }
    public double getMathematics() {
        return mathematics;
    }
    public void setChineseematics(double chineseematics) {
        this.chineseematics = chineseematics;
    }
    public double getChineseematics() {
        return chineseematics;
    }
    public static void main(String[] args) {
        student stu=new student();
        student stu1=new student("徐梦","河南","男",96,180.3,160.6);
        stu.message();
        stu1.message();
    }
}