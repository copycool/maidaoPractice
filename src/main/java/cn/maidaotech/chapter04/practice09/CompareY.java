package cn.maidaotech.chapter04.practice09;

import java.util.Comparator;
/*
定义一个CompareY的类实现Comparator<Point>，
按y坐标排序，y坐标一样的再按x坐标排序
*/
public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        
        return o1.getY() == o2.getY() ? o1.getX() - o2.getX():o1.getY() - o2.getY();
    }
    
}