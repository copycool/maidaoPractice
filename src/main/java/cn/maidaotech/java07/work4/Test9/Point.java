package cn.maidaotech.java07.work4.Test9;

public class Point implements Comparable<Point> {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x不相等，根据x排序
    // x相等，根据y排序

    @Override
    public int compareTo(Point point) {
        // if (this.x > point.x) {
        //     return 1;
        // }
        // if (point.getX() == this.x) {
        //     if (this.y > point.y) {
        //         return 1;
        //     }
        //     if (this.y < point.y) {
        //         return -1;
        //     }
        //     return 0;
        // }
        // // TODO Auto-generated method stub
        // return -1;
        if (this.x != point.x) {
            return this.x - point.x;
        } else {
            return this.y - point.y;
        }

    }

    @Override
    public String toString() {
return "("+x+","+y+")";
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
