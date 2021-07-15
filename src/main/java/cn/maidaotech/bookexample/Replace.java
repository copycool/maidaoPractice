package cn.maidaotech.bookexample;

public class Replace {
    public static void main(String[] args) {
        String str = "I ";
        str = str.replace("gate","gates");
        System.out.println(str);  
        str = str.replaceFirst("gates","gate");
        System.out.println(str);  
    }
    
    
}