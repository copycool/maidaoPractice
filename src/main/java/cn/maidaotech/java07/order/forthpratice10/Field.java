package cn.maidaotech.java07.order.forthpratice10;
//有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形，
//编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少
public class Field{
public static void main(String[] args) {
int length = 168;
int width = 64;
int side = area(length,width);
System.out.println(side);
}
public static  int area(int length,int width){
    if(length % width == 0){
        return width;
    }else{
        return area (width,length % width);
    }
}
}