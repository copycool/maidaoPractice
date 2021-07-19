package cn.maidaotech.java07.chapter04.homework.exercise10;

public class Test {
    // 有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形，
    // 编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少。（用递归函数实现）
    public static void main(String[] args) {

        System.out.println(land(9, 6));
        System.out.println(land(64, 168));

    }

    public static int land(int height, int width) {
        if (width == 0)
            return height;
        else
            return land(width, height % width);
    }

}