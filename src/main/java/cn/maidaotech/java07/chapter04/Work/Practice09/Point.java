package cn.maidaotech.java07.chapter04.Work.Practice09;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    @Override
    public int compareTo(Point o) {
        if (this.x != o.x) {
            return this.x - o.x;
        }
        if (this.y != o.y) {
            return this.y - o.y;
        }
        return 0;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]\n";
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
