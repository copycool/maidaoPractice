package cn.maidaotech.java07.forth.list10;
// .有一块长 168 米宽 64 米的土地，将这块地分隔成大小相等的正方形，编程计算满足以上条件的 
// 情况下，能分隔的最大正方形边长是多少
public class Square {
    public static void main(String[] args) {
        int length=168;
        int width=64;
        int side=separate(length,width);
        System.out.println("正方形边长"+side);
    }

    private static int separate(int length, int width) {
        if(length%width==0){
        return width;
        }else{
            return separate(width,length%width);
        }
    }
}
