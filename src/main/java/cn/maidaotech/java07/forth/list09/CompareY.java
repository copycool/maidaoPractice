package cn.maidaotech.java07.forth.list09;


import java.util.Comparator;

public class CompareY implements Comparator<Point> {


    @Override
    public int compare(Point o1, Point o2) {
        
        return (int) (o1.getY() == o2.getY() ? o1.getX() - o2.getX() : o1.getY() - o2.getY());
    }   
}
