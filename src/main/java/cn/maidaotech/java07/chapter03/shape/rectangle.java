package cn.maidaotech.java07.chapter03.shape;

public class Rectangle {
    static double width;
    static double height;
    public double area(){
        return width*height;
    }
    public  double perimeter(){
        return 2*(width+height);
    }
}