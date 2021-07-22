package cn.maidaotech.java07.ch04.Question9;

public class Point implements Comparable<Point>{
        private int x;
        private int y;
    public Point(){
    }    

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    


    @Override
    public int compareTo(Point o) {
       if(this.x!=o.x){
           return this.x-o.x;
       }else{
           return this.y-o.y;
       }
    }//按x坐标排序

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    
}
   
        

    

