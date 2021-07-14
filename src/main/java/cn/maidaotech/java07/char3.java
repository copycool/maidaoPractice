package cn.maidaitech.shui966;

public class char3 {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int ge,shi,bai;
        ge=i%10;
        shi=i/10%10;
        bai=i/100;
        if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai){
            System.out.println(i+"是水仙花数。");
        }
        }



    }
}