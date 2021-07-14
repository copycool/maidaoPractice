package cn.maidaotech.java07.chapter02;

public class test2089 {
    //判断101-200之间有多少个素数，并输出所有素数。
    public static void main(String[] args) {
        int sum=0;
        int flag=0;
        for(int num=101;num<=200;num++){
            flag=0;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=1;
                   break;
                }
            }
            if(flag==0){
              sum++;
              System.out.print(num+" ");
            }
          
        }
        System.out.println();
        System.out.println("素数共有："+sum+"个");
    }
}
