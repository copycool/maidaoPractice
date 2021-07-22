package cn.maidaotech.java07.chapter04.pointsort;

//定义一个 Point 类，他的两个数据域为坐标 x 和 y，
// 实现 comparable 接口，
// 按 x 坐标排序，x 坐标一样 的再按 y 坐标排序；
public class Point implements Comparable<Point> {
    Integer x;
    Integer y;

    @Override
    public int compareTo(Point o) {
        if(o instanceof Point){
            Point point = (Point)o;
            if(this.x > point.x){
                return 1;
            }else if(this.x < point.x){
                return -1;
            }else{
                return this.y.compareTo(point.y);
            }
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }
    public Point() {
        
    }
    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

   
    

}