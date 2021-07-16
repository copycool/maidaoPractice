package cn.maidaitech.shui966.Char3;
/*七
创建交通工具接口Vehicle
接口中定义start()和stop()方法
在两个分别Car和Bus的类中实现Vehicle接口
创建一个名为VehicleDemo的类
并编写main函数分别创建变量类型为Vehicle的Car和Bus对象
并分别访问两个方法。 */
public class VehicleDemo  {
    public static void main(String[] args) {
        car a=new car();
        a.start(null);
        a.stop(null);
        bus b=new bus();
        b.start(null);
        b.stop(null);
    }
}