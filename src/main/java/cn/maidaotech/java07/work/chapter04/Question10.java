package cn.maidaotech.java07.work.chapter04;

/**
 * 有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形，
 * 编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少。（用递归函数实现）
 */
public class Question10 {

    public static void main(String[] args) {
        int w = 68;
        int l = 168;
       //假设最大边长为  SideLength 米
        Integer sideLength = maxSideLength(w,l);
        System.out.println("最大正方形边长是：" + sideLength );
        
    }


    /**
     * 求最大公约数
     * @param legth
     * @param width
     * @return
     */
    public static Integer maxSideLength(int legth,int width){
        //求出两个数字之间的小值
        int min = legth < width ? legth : width;
        //这种方法运用了数学公式中的辗转相除法
        for (int i = min;i >= 1;i --) {
            if (legth % i == 0 && width % i == 0) {
                return i;
            }
        }
        return 0;
    }
}