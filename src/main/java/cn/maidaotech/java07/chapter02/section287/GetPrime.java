package cn.maidaotech.java07.chapter02.section287;
// 判断 101-200 之间有多少个素数，并输出所有素数
// 一个大于1的正整数，
// 除了1和它本身以外，不能被其他正整数整除，就叫素数。
public class GetPrime {
    public static void main(String[] args) {
        int count=0;   
        for (int i = 101; i <200 ; i++) {      //需要判断的数
            for (int j = 2; j <=i ; j++) {      //判断没有因数
                if(i%j==0){     //不是素数，判断下一个
                    break;
                }else if(j==i-1){   //已经试了从2到self-1的所有数，都不是因数，self是素数
                    count++;
                    System.out.println("101-200中第"+count+"个素数为"+i);
                }
            }
        }
        System.out.println("101-200中共有素数"+count+"个");
    }

}