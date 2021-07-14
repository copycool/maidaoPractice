package cn.maidaotech.java07;

public class Narcissus {
    public static void main(String[] args) {
        System.out.println("输出所有水仙花数:");
        for(int i=100;i<=999;i++){
           int individual=i%10; //获取个位  
           int ten=i/10%10; //获取十位
           int hundred=i/100%10; //获取百位
           int calculation=individual*individual*individual;
           int calculation1=ten*ten*ten;
           int calculation2=hundred*hundred*hundred;
            if(calculation+calculation1+calculation2==i){
               System.out.println(i);
            }
        }
        }
    }
