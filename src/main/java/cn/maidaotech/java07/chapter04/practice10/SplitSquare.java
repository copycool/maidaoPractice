package cn.maidaotech.java07.chapter04.practice10;

public class SplitSquare {
    public static void main(String[] args) {
        int length = 168;
        int width = 64;
        int side = separate(length, width);
        System.out.println("平均分隔的最大正方形边长：" + side);

    }
    private static int separate(int length,int width){
        if (length % width == 0) {
            return width;
        }else{
            return separate(width, length % width);
        }
    }
}