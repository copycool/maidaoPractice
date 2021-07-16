package cn.maidaotech.java07.chapter04.test03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素。
 */
public class TraverseList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "1","2","3","4","5","2","1","2","3","4","5", "1","2","3","4","5");
        List<String> list2 = r(list1);
        for (Object object : list2) {
            System.out.println(object);
        }
    }
    public static List<String> r(List<String> list){
        for (int i =0;i<list.size();i++) {
            for(int j=list.size()-1;j>i;j--){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        return list;
    }
}
