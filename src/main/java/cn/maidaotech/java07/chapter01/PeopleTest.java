package cn.maidaotech.java07.chapter01;

public class PeopleTest {
    public static void main(String[] args) {
        People xiaoming = new People();
        xiaoming.setArea("郑州市");
        xiaoming.setName("xiaoming");
        People zhangsan = new People();
        System.out.println(zhangsan.getArea());
        System.out.println(zhangsan.getName());
        zhangsan.setArea("龙湖镇");
        System.out.println(xiaoming.getArea());
        {
            {
                int i =0;
                ++i;
            }
        }
    }
}
