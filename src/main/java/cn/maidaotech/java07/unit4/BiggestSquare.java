package cn.maidaotech.java07.unit4;

public class BiggestSquare {
    public static void main(String[] args) {
        int length = 168;
        int width = 64;
        int side = separate(length, width);
        System.out.println("平均分隔的最大正方形边长：" + side);

    }

    private static int separate(int length, int width) {
        if (length % width == 0) {
            return width;
        } else {
            return separate(width, length % width);
        }
        

        
    }
}