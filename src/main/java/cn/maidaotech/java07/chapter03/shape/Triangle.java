package cn.maidaotech.java07.chapter03.shape;

public class Triangle {
    static double a;
    static double b;
    static double c;
    public double area(){
        double S = (a+b+c)/2;
	    return Math.sqrt(S*(S-a)*(S-b)*(S-c));
    }
    public double perimeter(){
        return a+b+c;
    }
}