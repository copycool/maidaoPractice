package cn.maidaotech.java07.chapter02.section287;
// 用字符“*”打印一个边长为 100 个*的空心正方形。
public class PrintSquare {
    public static void main(String[] args){
         for (int i = 1; i <=10; i++) {             //10行
             for (int j = 1; j <= 10; j++) {        //每行10个占位
                 if (i == 1 || i == 10 || j == 1 || j == 10) {   //第一行，第十行，每行的第一个和第末个是*
                     System.out.print("* ");
                 } else {
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }
     }
}