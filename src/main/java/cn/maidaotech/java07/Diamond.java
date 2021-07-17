package cn.maidaotech.java07;

public class Diamond {
    
        public static void main(String[] args) {
            int row = 7;
            // 内容最多的一行的行数
            int maxNum = (row + 1) / 2;     
            // 正三角
            for(int i = 1; i <= maxNum; i++) {
                for(int j = 1; j <= maxNum- i; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }    
            // 倒三角
            for(int i = row - maxNum; i > 0; i--) {
                for(int j = 1; j <= maxNum - i; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= 2 * i -1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
  
