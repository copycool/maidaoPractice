package cn.maidaotech.java07;

public class Square {
    public static void main(String[] args) {
        int length =10;
        for(int i=1;i<=length;i++){
            StringBuilder str = new StringBuilder();
           for(int j=1;j<=length;j++){
               if(i==1||i==length){
                   str.append("* ");
               }else if(j==1||j==length){
                   str.append("* ");
               }else{
                   str.append("  ");
               }
           }
           System.out.println(str.toString());
           
         
            
        }
    }

    }
