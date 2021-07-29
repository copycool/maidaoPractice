package cn.maidaotech.java07.chapter4.question10;

/*有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形
编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少。（用递归函数实现） 
*/
public class PartitionSquare {
    public static void main(String[] args) {
        int length = 168;
        int wide = 64;
        System.out.println("最大正方形边长是: " + square(length, wide) + "米");

    }

    private static int square(int Length, int wide) {
        if (Length % wide == 0) {
            return wide;
        } else {
            return square(wide, Length % wide);
        }

    }
}