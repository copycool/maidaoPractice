package cn.maidaotech.java07.work4.Test9;

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        // return (x.getY() > y.getY()) ? 1 : ((x.getX() < y.getX() ? -1 : 0));
    //     if (o1.getY() == o2.getY()) {
    //         if (o1.getX() == o2.getX()) {
    //             return 0;
    //         }
    //         if (o1.getX() > o2.getX()) {
    //             return 1;
    //         }
    //         return -1;

    //     }
    //     if (o1.getY() > o2.getY()) {
    //         return 1;
    //     }
    //     return -1;
    return o1.getY() == o2.getY() ? o1.getX() - o2.getX() : o1.getY() - o2.getY();}

}
