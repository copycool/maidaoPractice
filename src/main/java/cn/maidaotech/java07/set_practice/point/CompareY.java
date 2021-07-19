package cn.maidaotech.java07.set_practice.point;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1.getY() > o2.getY()) {
            return 1;
        }
        if (o1.getY() < o2.getY()) {
            return -1;
        }
        if (o1.getX() > o2.getX()) {
            return -1;
        }
        if (o1.getX() < o2.getX()) {
            return 1;
        }
        return 0;
    }

}