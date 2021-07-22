package cn.maidaotech.java07.third.shap;

public class Rectangle {
    double lengh;
    double wide;
    public  Rectangle(double lengh,double wide){
    this.lengh=lengh;
    this.wide=wide;
    }
    
    public double getLengh() {
        return lengh;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    double area(){
        return lengh*wide;
    }
    double perimeter(){
        return 2*lengh+2*wide;
    }
}
