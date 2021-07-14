package cn.maidaotech.java07.chapter02.section256;
//打印出所有的“水仙花数”
// 即一个三位数，其各位数字的立方和等于该数本身，例如 153
// 三位的水仙花数共有4个:153,370,371,407
public class daffodil {
    
    public static void main(String[] args){
    int b,s,g,p;
    for(int num=100;num<=999;num++){
        b = num/100;
        s = num/10%10;
        g = num%10;
        p = b*b*b+s*s*s+g*g*g;
        if(num==p){
            System.out.println(num);
        }
    }


    }
}