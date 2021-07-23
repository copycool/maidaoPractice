package cn.maidaotech.java07.chapter04.Work.Practice09;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {

        return o1.getY() == o2.getY() ? o1.getX() - o2.getX() : o1.getY() - o2.getY();
    }

}
