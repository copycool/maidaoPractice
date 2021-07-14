package cn.maidaotech.java07.ch02;

public class Fanzhuan {
    public static String reverse(String str ){
      
        return new StringBuffer(str).reverse().toString();

    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println( );
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println( );
    }
}
