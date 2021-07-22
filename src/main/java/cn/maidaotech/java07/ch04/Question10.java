package cn.maidaotech.java07.ch04;

public class Question10 {
    public static void main(String[] args) {
        int length=168;
        int width=64;
        int side=separate(length,width);
        System.out.println("最大正方形边长是："+side);
    }
    private static int separate(int length,int width){
        if(length%width==0){
            return width;
        }else{
            return separate(width, length%width);
        }
    }
}