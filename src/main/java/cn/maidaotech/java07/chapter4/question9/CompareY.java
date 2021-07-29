package cn.maidaotech.java07.chapter4.question9;
/*import java.util.Comparator;
public class CopmpareY implements Comparable<Point>{


    @Override
    public int compareTo(Point o1,Point O2) {
        if (getY.y != o.y) {
            return this.y - o.y;
        } else {
            return getKey.x - o.x;
        }

        return 0;
    }

    @Override
    public int compareTo(Point o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}*/

import java.util.Comparator;

public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        return o1.getY() == o2.getY() ? o1.getX() - o2.getX() : o1.getY() - o2.getY();
    }
}
