package cn.maidaotech.java07.chapter02.section287;
// 输出 9*9 乘法口诀
public class MulTables {
    public static void main( String[] args){
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
            
                System.out.print(" " + i + "*" + j + "=" + (i * j)+"\t");
                if(i == j){
                    System.out.print("\n");
                }
                
            }
        }
    }
}
