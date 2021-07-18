package cn.maidaotech.java07.chapter;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        Map <String ,String> map = new HashMap<>(4);
        map.put("Tom", "111");
        print(map);
        
        map.put("Tom1", "111");
        print(map);

        map.put("Tom2", "111");
        print(map);

        map.put("Tom3", "111");
        print(map);
        
    }
    public static void print(Map<String,String> map){
        try{
        Class<?> mapType = map.getClass();
        Method capacity = mapType.getDeclaredMethod("capacity");
            capacity.setAccessible(true);
            System.out.println("capacity : " + capacity.invoke(map) + "    size : " + map.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
