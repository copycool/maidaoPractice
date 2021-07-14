package cn.maidaitech.shui966;

public class char9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(j==n-i-1||j==n+i-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i=5;i<9;i++){
            for (int j = 0; j<9; j++) {
                if(i-j==4)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            //System.out.println();错误
        }
        
    }
}