package cn.maidaotech.java07.chapter02.section287;
// 输出 9*9 乘法口诀
public class MulTables {
    public static void main( String[] args){
        for (int i = 1; i <= 9; i++){       //一共九行，每一行的行数也是一个乘数
            for (int j = 1; j <= i; j++){   //第一个乘数是i，第二个因数从1到和第一个相等
                System.out.print(" " + i + "*" + j + "=" + (i * j)+"\t");
                if(i == j){                  //两乘数相等，内层for循环终止，同时换行，行+1，乘数从1继续
                    System.out.print("\n");
                }
                
            }
        }
    }
}
