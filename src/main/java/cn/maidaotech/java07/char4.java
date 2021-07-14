package cn.maidaitech.shui966;

public class char4 {
    public static void main(String[] args){
                String str="abcdef"; 
                String temp=""; 
                
                for (int i = 0; i < str.length(); i++) { 
                      temp=temp+str.charAt(str.length()-1-i); 
                } 
                     System.out.println(temp); 
              } 
            
    }