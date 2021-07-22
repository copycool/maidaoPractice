package cn.maidaotech.java07.chapter04;

public class DivisionLand {
    // 有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形，
    // 编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少。（用递归函数实现）
    // 土地长或宽与正方形边长取模都要等于0
    // 正方形的边长不能超过土地的宽也就是64
    public static void main(String[] args) {
        division();
    }
    
    public static void division() {
        int max = 0;
        for (int s = 1; s <= 64; s++) {

            if (168 % s == 0 && 64 % s == 0) {
                max = s;
            }
        }
        
        System.out.println("最大边为："+max);
    }
}
