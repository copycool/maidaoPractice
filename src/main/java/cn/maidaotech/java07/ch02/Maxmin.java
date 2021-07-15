package cn.maidaotech.java07.ch02;
import java.util.Scanner;
public class Maxmin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a=in.nextInt();

        System.out.println("请输入一个数字：");
        int b=in.nextInt();

        System.out.println("请输入一个数字：");
        int c=in.nextInt();
        int max,min;
        if(a>b){
            max=a;min=b;
        }else{
            max=b;min=a;
        }
        if(max<c){
            max=c;
        if(min>c){
            min=c;
        }
    }System.out.println("max"+"="+max);
    System.out.println("min"+"="+min);

    for(int i=1;i<=9;i++){
        for(int j=1;j<=9;j++){
            System.out.print(i+"*"+j+"="+i*j+" ");
        }
        System.out.println( );
    }

    }
    
}
