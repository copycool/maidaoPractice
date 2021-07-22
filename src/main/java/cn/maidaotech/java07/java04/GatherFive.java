package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.List;

public class GatherFive {
    public static void main(String[] args) {
        List<Integer> t = new ArrayList(20);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                t.add(j);
                
            }
        }

        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).equals(2)) {
                t.remove(i);
                System.out.println("删除内容>>>"+i);
            }
            System.out.println("输出"+t.get(i));
        }
        System.out.println("剩余集合数量>>>"+t.size());

    }
}