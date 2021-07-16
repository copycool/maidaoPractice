package com.example.demo.two;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份：");
        int number = scanner.nextInt();
        boolean falg = false;   
        if(number%4!=0){       
          falg=false;   
        }else if(number%100!=0){      
          falg=true;   
        }else if(number%400!=0){   
            falg=false;      
        }else{   
        falg=true;   
        }          
          
        if(falg==true){   
          System.out.println("是閏年");   
        }else{   
          System.out.println("不是閏年");   
        }   
        
    }
}