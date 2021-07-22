package cn.maidaotech.java07.chapter04.test09_point;

public class Point implements Comparable<Point> {
    private Integer x;
    private Integer y;

    public Point() {
    }

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
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

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x){
            return this.y-o.y;
        }else{
            return this.x-o.x;
        }

    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
