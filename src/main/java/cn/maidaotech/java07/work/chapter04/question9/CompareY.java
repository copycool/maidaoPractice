package cn.maidaotech.java07.work.chapter04.question9;

public class CompareY implements  Comparable<Point>{

    public int x;
    public int y;

    public CompareY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CompareY() {

    }

    @Override
    public int compareTo(Point o) {
        if (this.y == o.y){
            return this.x - o.x;
        }
        return this.y - o.y;
    }
}