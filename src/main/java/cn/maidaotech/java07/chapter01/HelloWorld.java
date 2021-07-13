package cn.maidaotech.java07.chapter01;

public class HelloWorld {
    public static void main(String[] args) {
       String str = new String("迈道");
       str+="科技";
       for (int i = 0; i < 10; i++) {
           str+=i;
       }
       System.out.println(str);

       HelloWorld h = new HelloWorld();
       System.out.println(h);
    }

//     static{
//         System.out.println("static代码块");
//     }

//     {
//         System.out.println("非static代码块");
//     }

//     private void method(){
//         System.out.println("非静态");  
//     }
}