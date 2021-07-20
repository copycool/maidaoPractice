package cn.maidaotech.java07.chapter04;
//创建一个 Set 集合，保存 20 个 40 以内的随机整数，必须保证 20 个。

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetSaveRandom {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<Integer>();
        Random random = new Random();
        int min = 20;
        int max = 40;
        while(hs.size()<20){
            hs.add(random.nextInt(max-min)+min);
        }
        System.out.println("随机生成的(20,40)内的20个整数如下：");
       for (Integer item : hs) {
           System.out.print(item+"———");
       }
    }
   

}