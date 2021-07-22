package cn.maidaotech.java07.chapter04;
//有一块长 168 米宽 64 米的土地，
//将这块地分隔成大小相等的正方形，
//编程计算满足以上条件的情况下，
//能分隔的最大正方形边长是多少。(最大公约数)（用递归函数实现）
public class LandDivide {
    public static void main(String[] args) {
        sub_land(168,64);
    }
//求最大公约数 
    public static void sub_land(int length, int width){
        int remainder = length % width;
        if(remainder == 0){
            System.out.println("能分隔的最大正方形边长为："+width);
        return;
        }else{
            sub_land(width, remainder);
        }
    }
}