package cn.maidaotech.java07.shap;

public class Shapatext {
    public static void main(String[] args) {
    {    Circular circular=new Circular(3);
        System.out.println("圆的面积为："+circular.area());
        System.out.println("圆的周长为："+circular.perimeter());
    }
    {
        Tiangle tiangle=new Tiangle(4);
        System.out.println("正三角形的面积为："+tiangle.area());
        System.out.println("正三角形的周长为："+tiangle.perimeter());
    }
    {
        Rectangle rectangle=new Rectangle(2,3);
        System.out.println("长方形的面积为："+rectangle.area());
        System.out.println("长方形的周长为："+rectangle.perimeter());
        
    }



    }
    }

