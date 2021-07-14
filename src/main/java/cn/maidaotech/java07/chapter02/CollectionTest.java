package cn.maidaotech.java07.chapter02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.logging.java.JavaLoggingSystem.Factory;

public class CollectionTest {
    public static void main(String[] args) {
        //break continue
        
    flag:for (int i = 0; i < args.length; i++) {
            List<Object> list = new ArrayList<>();
            for (Object object : list) {
                if(object instanceof Integer){
                    break flag;
                }
            }
        }
        String a = null; 
        switch(a){
            case "null":
            System.out.println();
            default:
        }
    }
}
