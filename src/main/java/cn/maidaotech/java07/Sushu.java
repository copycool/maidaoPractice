package cn.maidaotech.java07;


    public class Sushu
{
    public static void main(String[] args){
        int i=2;
        for(i=2; i<=100; i++){
         boolean flag =true; 
         for(int j=2; j<i; j++ ){

             if( i%j==0){
                 flag = false;
                 break;
             }

         }
         if(flag){
             System.out.println("i--->"+i);
         }  
        }
        

    }
 }
    
