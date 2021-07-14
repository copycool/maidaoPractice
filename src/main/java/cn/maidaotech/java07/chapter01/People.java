package cn.maidaotech.java07.chapter01;

public class People {
    private String name;
    private static String area;// 类变量 模板属性 公用属性 People.setArea()

public static String getArea() {
        return area;
    }

 public static void setArea(String area) {
        People.area = area;
    }

public People(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
    
}
