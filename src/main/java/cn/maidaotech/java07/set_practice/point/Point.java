package cn.maidaotech.java07.set_practice.point;

public class Point implements Comparable<Point> {
    private Integer x;
    private Integer y;

    @Override
    public int compareTo(Point obj) {
        if (obj == null) {
            return -1;
        }
        if (this == obj) {
            return 0;
        }

        if (this.x > obj.x) {
            return 1;
        }
        if (this.x < obj.x) {
            return -1;
        }
        if (this.y > obj.y) {
            return -1;
        }
        if (this.y < obj.y) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

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

}