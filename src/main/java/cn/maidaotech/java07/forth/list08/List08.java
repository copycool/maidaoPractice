package cn.maidaotech.java07.forth.list08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。
public class List08 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(20);
        for(int i=0;i<20;i++){
            list.add((int)(Math.random()*10));
            System.out.println(list.toString());
            Map<Integer,Integer> map=new HashMap<>();
//             for(Integer m :list){
//                 if(map.containsKey(m)){
//                     map.put(m,map.get(m)+1 );
//                 }else{
//                     map.put(i, 1);
//                 }
                
// }
}
}
}