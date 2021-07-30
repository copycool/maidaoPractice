package cn.maidaotech.java07.unit3;

public class PeopleTest {
    public static void main(String[] args) {
       People p1=new People("张三", "漳州市", "男"," 18");
       People p2=new People("李四", "郑州市", "女"," 20");
       People p3=new People("凯皇", "开封市", "男"," 21");
       People p4=new People("小红", "上海市", "女"," 19");
       People [] peoples={p1,p2,p3,p4};
       for(int i=0;i<peoples.length;i++){
           output(peoples[i]);
           System.out.println();
       }
}
public static  void output(People people) {
    System.out.println("名字："+people.getName());
    System.out.println("地址："+people.getAddress());
    System.out.println("性别："+people.getSex());
    System.out.println("年龄："+people.getAge());
    }
}