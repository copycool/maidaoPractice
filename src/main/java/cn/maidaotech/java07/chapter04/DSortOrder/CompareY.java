package cn.maidaotech.java07.chapter04.DSortOrder;

import java.util.Comparator;

public class CompareY implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        if (o1.getY() != o2.getY())
            return o1.getY() - o2.getY();
        return o1.getX() - o2.getX();
    }


 
}