package cn.maidaotech.java07.zuoye;

import java.util.Scanner;

public class printrhombus {

    public static void main(String[] args) {
        {   
            int i,j;
            for(i=1;i<=5;i++)
            {
               for(j=1;j<=5-i;j++)
               {
                System.out.println("");
               }
               System.out.println("*");
               for(j=1;j<=2*i-3;j++)
               {
                System.out.println("");
               }
               if(i>=2)
               System.out.println("*");
              
            }//空心菱形上半部分
            for(i=1;i<=4;i++)
            {
               for(j=1;j<=i;j++)
               {
                System.out.println("");   
               }
               System.out.println("*");
               for(j=3;j>=2*i-3;j--)
               {
                System.out.println("");
               }
               if(i<=3)
               System.out.println("*");
              
            }//空心菱形下半部分
            
        }
    }
}
