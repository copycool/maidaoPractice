package cn.maidaotech.java07;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.joran.util.StringToObjectConverter;

@SpringBootApplication
public class Java07Application {
  
    public static void zhl(String str) { 
        String newString=""; 
        for (int i = 0; i < str.length(); i++) { 
            newString=newString+str.charAt(str.length()-1-i); 
        } 
        System.out.println(newString); 
    } 

public static void main(String args[]) {
   zhl("abcd");
    

  }
    
}   
	

	

