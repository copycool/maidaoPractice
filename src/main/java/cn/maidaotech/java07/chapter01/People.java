package cn.maidaotech.java07.chapter01;

public class People {
    private static String area;
    private String name;

    public People(){}

    public People(String name){
        this.name = name;
    }

    public static String getArea() {
        return area;
    }

    public static void setArea(String area) {
        People.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
