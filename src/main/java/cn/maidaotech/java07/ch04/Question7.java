package cn.maidaotech.java07.ch04;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class Question7 {
    public static void main(String[] args) {
        String target="I love everything";
        ArrayList<String> list=new ArrayList<>();
        for(String temp:target.split(" ")){
            list.add(temp);
        }
       Collections.sort(list);
       for(String temp:list){
           System.out.println(temp+"");
       }
    }
}
