package cn.maidaotech.java07.chapter04.Work;

public class Practice10 {
   

    private static int square(int length,int width) {
        if (length % width == 0) {
            return width;
        } else {
            return square(width, length % width);
        }


    }

    public static void main(String[] args) {
        int result = square(168,64);
        System.out.println("最大的正方形边长为" + result);
    }
}
