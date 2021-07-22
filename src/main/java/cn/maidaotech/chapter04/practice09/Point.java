package cn.maidaotech.chapter04.practice09;
/*
定义一个Point类，他的两个数据域为坐标x和y，
实现comparable接口，按x坐标排序，x坐标一样的再按y坐标排序
*/
public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x != o.x){
            return this.x - o.x;
        }else{
            return this.y - o.y;
        }
        
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
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
    
    
}