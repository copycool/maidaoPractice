package cn.maidaotech.java07.chapter04;


// 定义一个 Point 类，他的两个数据域为坐标 x 和 y，实现 comparable 接口，
// 按 x 坐标排序，x 坐标一样 的再按 y 坐标排序；
public class Point implements Comparable<Point> {

    private Integer x;
    private Integer y;
    @Override
    public int compareTo(Point o) {
        if(this.x!=o.x)
            return this.x -o.x;
            return this.y -o.y;
        }
        
        public Point(Integer x,Integer y){
            this.x = x;
            this.y = y;
        }
  @Override
        public String toString() {
            return "Point [x=" + x + ", y=" + y + "]";
        }
        
    

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
  
    
}