package cn.maidaotech.chapter04.practice10;
/*
有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形，编程计算满足以上条件的情况下，
能分隔的最大正方形边长是多少。（用递归函数实现）
*/
public class Square {
    public static void main(String[] args) {
        int length = 168;
        int width = 64;
        int MaxSide = separate(length, width);
        System.out.println(MaxSide);
        

    }
    private static  int separate(int length,int width) {
        if(length % width == 0){
            return width;//长对宽求余 没有余数 长是宽的倍数
        }else{
            return separate(width, length%width);//递归
        }
    }
}