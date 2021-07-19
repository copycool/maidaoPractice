package cn.maidaotech.java07.work.chapter04.question9;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    public int x;
    public int y;

    public CompareY(int x, int y ) {
        this.x = x;
        this.y = y;
    }

    public CompareY() {

    }


    @Override
    public int compare(Point o1, Point o2) {
        if (o1.y == o2.y){
            return o1.x -o2.x;
        }
        return o1.y - o2.y;
    }
}