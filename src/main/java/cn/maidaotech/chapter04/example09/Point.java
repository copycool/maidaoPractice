package cn.maidaotech.chapter04.example09;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    // 重写tostring方法
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
        return this.x != o.x ? this.x - o.x : this.y - o.y;
    }

}