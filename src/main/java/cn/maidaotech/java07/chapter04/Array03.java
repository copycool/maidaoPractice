package cn.maidaotech.java07.chapter04;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 创建一个集合存入 20 个 10 以内的整数，遍历集合，删除所有指定数字的元素。
public class Array03 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        while(list1.size()!=20){
            list1.add((int)(Math.random() * 10));
        }
        // for(int i =0;i<list1.size();i++){
          
        //     list1.add(i);
        // }
        
       
        // for(int i =0;i<list1.size();i++){
        //     list1.remove(10);
        // }
        
        System.out.println(list1);
        System.out.println(remove(list1,5));
        
    }

    private static List<Integer> remove(List<Integer> list1 , Integer op ) {
        if(list1 ==null||list1.isEmpty())
            return null;
            Iterator<Integer> iterator = list1.iterator();
            while(iterator.hasNext()){
                if(op.equals(iterator.next())){
                    iterator.remove();;
                }
            }


        
        return list1;
        
    }
}