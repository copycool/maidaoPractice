package cn.maidaitech.shui966;

public class char8 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(i==0||j==0||i==99||j==99)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}