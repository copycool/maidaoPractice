package cn.maidaotech.java07;

public class CharReverse {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder("abc"); 
        System.out.println("String = "+ builder.toString()); 

        StringBuilder reverseBuilder = builder.reverse();
    
        
        System.out.println("Reverse String = " + reverseBuilder.toString());
    }
    
    
}