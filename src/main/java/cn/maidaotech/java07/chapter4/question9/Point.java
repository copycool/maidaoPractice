package cn.maidaotech.java07.chapter4.question9;

/*对二维平面上的点进行排序：
定义一个Point类，他的两个数据域为坐标x和y，
实现comparable接口，按x坐标排序，x坐标一样的再按y坐标排序；
定义一个CompareY的类实现Comparator<Point>，按y坐标排序，y坐标一样的再按x坐标排序；
随机点，然后使用Arrays.sort()方法和Collections.sort()分别以他们x坐标的升序和y坐标的升序显示这些点 */
public class Point implements Comparable<Point> {
    Integer x;
    private Integer y;

    public Point() {

    }

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x != o.x) {
            return this.x - o.x;
        } else {
            return this.y - o.y;
        }

    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getX() {
        return x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getY() {
        return y;
    }

}