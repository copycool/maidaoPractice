package cn.maidaotech.java07.order.seventh.practice8;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Program {
       public static void main(String[] args) {
      StringBuffer s1 = new StringBuffer();
      StringBuffer s2 = new StringBuffer();
      
      new Thread(){
          public void run() {
            System.out.println("begin = "+System.currentTimeMillis());
           synchronized(s1){
               s1.append('a');
               s2.append('b');
               try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
               synchronized(s2){
                   s1.append('c');
                   s2.append('d');
               System.out.println(s1);
               System.out.println(s2);
               System.out.println("end = "+System.currentTimeMillis());
               }
           }
        }
    }.start();
        new Thread()
           {
                public void run() {
                    System.out.println("begin = "+System.currentTimeMillis());
               synchronized(s2){
                   s1.append('e');
                   s2.append('f');
                   try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                   synchronized(s1){
                       s1.append('g');
                       s2.append('h');
                   System.out.println(s1);
                   System.out.println(s2);
                   System.out.println("end = "+System.currentTimeMillis());
                   }
               }
            }
           }.start();
         
        }
    }
    




    

