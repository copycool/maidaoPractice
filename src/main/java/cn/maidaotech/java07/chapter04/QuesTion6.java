package cn.maidaotech.java07.chapter04;
//创建一个Set集合，保存20个30以内的随机整数，必须保证20个
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class QuesTion6 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(20);

        while (set.size()<20){
            set.add(new Random().nextInt(30)+1);
        }

        System.out.println(set );
    }
}
