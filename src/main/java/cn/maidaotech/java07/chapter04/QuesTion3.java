package cn.maidaotech.java07.chapter04;
// 创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class QuesTion3 {
    public static void main(String[] args) {
    
        List<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=20;i++){
            list.add(new Random().nextInt(5)+1);
        }

        System.out.println(list);
        System.out.println("======");

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next() % 2 != 0){
                iterator.remove();
            }
        }

        System.out.println(list );
    }
}
