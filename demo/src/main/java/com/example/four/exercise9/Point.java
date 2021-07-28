package com.example.four.exercise9;

public class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point o){
        if (this.x !=o.x) {
            return this.x - o.x;
        }else{
            return this.y - o.y;
        }
    }
    public String toString(){
        return"(" + x +","+ y +")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}