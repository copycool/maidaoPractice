package com.example.demo;



import java.util.Scanner;


public class StudentNumber {
  
    public void StudentNumber(){

    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号: ");
        int number = scanner.nextInt();
        System.out.println("年份为" + number/10000);
        int a = number%10000/100;
        System.out.println("期数为" + a);
        int b = number%100;
        System.out.println("序号为" + b);
        }
      
 
    }
    
