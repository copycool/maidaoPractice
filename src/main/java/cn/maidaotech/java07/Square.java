package cn.maidaotech.java07;

public class Square {
    public static void main(String[] args) {
            System.out.println("********************");
        for (int j = 0; j<=20; j++) {
           if(j>1&&j<20){
           System.out.println("*                   *");
           }else{
            System.out.println("********************");
           }
        }
        {
         for (int i = 101; i <=200; i++) {
             for (int j = 0; j <=200; j++) {
                if(i!=j && i!=1){
                 if(i%j==0){
                  System.out.println(i);
                 }
                }
             }
         }
        }
    }
    
  
}