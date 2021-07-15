package cn.maidaotech.java07.chapter02.section287;

// 使用字符“*”号打印一个边长为 5 个“*”的菱形。那么边长为 10
// 个、20 个“*”的菱形呢？

public class rhombus {
    //实心
    public static void main(String[] args){
        printSolid();
        System.out.println();
        printHollow();
}

    public static void printSolid(){
         //上半三角形,分三块，左空格，与行成反比，i,j相反，中间三角形分两块，中位线和左边一块，余一块
        for(int i=1;i<=5;i++){        //逐行
            for(int j=5;j>i;j--){        //左空格
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");      //左* ，与行同增
            }
            for(int j=1;j<i;j++){
                System.out.print("*");   //右*，第一行不打印，比左星少一行，与行同增
            }
            System.out.println();
        }
        //下半三角形
        for(int i=1;i<=4;i++){        //逐行
            for(int j=1;j<=i;j++){        //左空格，与行同增，i,j=1同步
                System.out.print(" ");
                }
            for(int j=4;j>=i;j--){        //行+星-，i,j相反
                System.out.print("*");      //左* 
            }
            for(int j=4;j>i;j--){
                System.out.print("*");   //右*，第一行不打印，同上
            }
            System.out.println();
        }
    }



    //空心
    public static void printHollow(){
        for (int i = 1; i <= 5; i++) {      //行数

            for (int j = 5; j > i; j--) {   //左空格，与行增减相反，i,j反向
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {      
                if (j == 1 || j == 2 * i - 1) {       
                    System.out.print("*");              //记每个空格后的第一个*为1，则第二个*按此依次数为：不用打，3,5,7,9
                } else {                                //和行数i的关系为2i-1;而打印的位置序列就是j,所以第二个*的打印用j=2i-1
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

             //下半部分           
        for (int i = 4; i >=1 ; i--) {       //还剩四行，用4才能和未知序列用表达式联系起来
            for (int j = 1; j <= 5-i; j++) {  //左半部一共有五个位置序列
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

    