package cn.maidaotech.java07.chapter06;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            List<String> list= new ArrayList<>();
            System.out.println(list.get(0));

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("出错了");
    }
}
