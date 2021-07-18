package cn.maidaotech.java07;

public class MultiplicationTable {
    public static void main(String[] args) {
        int x;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                x =i*j;
               System.out.print(j+"*"+i+"="+x+"\t"); 


            }
            System.out.println(" ");
        }
    }
    
}