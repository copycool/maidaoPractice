package cn.maidaotech.java07.chapter02.section287;
// 判断 101-200 之间有多少个素数，并输出所有素数
// 一个大于1的正整数，
// 除了1和它本身以外，不能被其他正整数整除，就叫素数。
public class GetPrime {
    public static void main(String[] args) {
        int count=0;   
        for (int i = 101; i <200 ; i++) {
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    break;
                }else if(j==i-1){ 
                    count++;
                    System.out.println("101-200中第"+count+"个素数为"+i);
                }
            }
        }
        System.out.println("101-200中共有素数"+count+"个");
    }

}