package cn.maidaotech.java07.chapter04.PointSort;

import java.util.Comparator;

//定义一个 CompareY 的类实现 Comparator<Point>，
//按 y 坐标排序，y 坐标一样的再按 x 坐标排序；
//随机创建 100 个点，然后使用 Arrays.sort()方法和 Collections.sort()
// 分别以他们 x 坐标的 升序和 y 坐标的升序显示这些点
public class CompareY implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.y > o2.y){
            return 1;
        }else if(o1.y < o2.y){
            return -1;
        }else{
            if(o1.x > o2.x){
                return 1;
            }else if(o1.x < o2.x){
                return -1;
            }else{
                return 0;
            }
        }
    }
}