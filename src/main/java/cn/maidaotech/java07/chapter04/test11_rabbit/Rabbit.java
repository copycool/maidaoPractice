package cn.maidaotech.java07.chapter04.test11_rabbit;

public class Rabbit {
    
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            int sum = sum(i);
            System.out.println(sum);
        }
        
    }
    private static int sum(Integer i){
        if(i==1||i==2){
            return 1;
        }else{
            return sum(i-1)+sum( i-2);
        }
    }
}
