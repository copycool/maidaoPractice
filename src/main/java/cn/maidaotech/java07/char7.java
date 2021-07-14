package cn.maidaitech.shui966;


public class char7 {
    public static void main(String[] args) {
        int a=100;
        int b=20;
        int c=60;
        int tep=a>b?a:b;
        int max=tep>c?tep:c;
        System.out.println("三个数值中最大值"+max);
        int amp=a<b?a:b;
        int min=amp<c?amp:c;
        System.out.println("三个数中数值最小的是"+min);


    }
}