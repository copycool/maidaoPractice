package cn.maidaotech.java07.work.chapter04.question9;

public class Point implements Comparable{

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Point)){
            throw new RuntimeException("转换Point类失败");
        }
        Point pointObj = (Point)o;
        if (this.x == pointObj.x){
            return this.y - pointObj.y;
        }
        return this.x - pointObj.x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}