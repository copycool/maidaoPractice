package cn.maidaotech.java07.chapter02.section267;

public class Test {
 
    public static void main(String[] args) {
     for(int j=0;j<10;j++){
            for(int i=0; i<10; i++){
                if(i==5){
                    break;//跳出一层循环
                }
                System.out.print(i+" ");
            }
        System.out.println(j);
     
        }
    }
}