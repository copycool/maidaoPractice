package cn.maidaotech.java07.chapter.gather;

    import java.util.HashMap;  
import java.util.Iterator;  
import java.util.Map;  
import java.util.Map.Entry;  
  
public class Demo02 {  
  
    public static void main(String[] args) {  
        int[] arr = new int[] { 1, 1, 3, 5, 6, 6, 6, 8, 8, 9, 2,8, 3 };  
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();  
        for (int i = 0; i < arr.length; i++) {  
            if (map.containsKey(arr[i])) {  
                map.put(arr[i], map.get(arr[i]) + 1);  
            } else {  
                map.put(arr[i], 0);  
            }  
  
        }  
        int count=-1;  
        int max=Integer.MIN_VALUE;  
        Iterator<Entry<Integer, Integer>> iter = map.entrySet().iterator();  
        while (iter.hasNext()) {  
            Map.Entry<Integer,Integer> entry =  iter.next();  
            if (entry.getValue()>count||(entry.getValue()==count&&entry.getKey()>max)) {  
                max=entry.getKey();  
                count=entry.getValue();  
            }  
        }  
  
        System.out.println(max);  
  
    }  
  
}  
