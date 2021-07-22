package cn.maidaotech.java07.third.shap;
public class Tiangle extends Shap {
    
        double base;
        public Tiangle(double base){
            this.base=base;
        }    
public double area(){
    return base*base*0.75*0.75; 
}
public  double perimeter(){
    return base*3;
    }
}