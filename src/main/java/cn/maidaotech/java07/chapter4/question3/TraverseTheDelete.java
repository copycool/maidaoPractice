package cn.maidaotech.java07.chapter4.question3;
//创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素。
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TraverseTheDelete {
        public static void main(String[] args) {
        
        List<Integer> list = new ArrayList();
        
        for(int i=1;i<=20;i++){
            list.add(new Random().nextInt(5));
        }

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next() ==3){
                iterator.remove();
            }
        }

        System.out.println(list);
    }

    
}