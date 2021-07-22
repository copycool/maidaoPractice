package cn.maidaotech.java07.chapter04.test12_bankcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 编写一个程序，创建一个 HashMap 对象，用于存储银行储户的信息（其中储户的主要信息有储 户的 ID、姓名和余额）。另外，根据储户 ID
 * 获取其余额信息。
 */
public class TsetMain {
    public static void main(String[] args) {
        Map<Integer, Depositor> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i, new Depositor("用户" + i, (double) i * 100));
        }

        Depositor depositor;
        int id;
        try {
            id = (int) (Math.random() * 100);
            depositor = query(map, id);
            System.out.println("用户id：" + id + "用户名：" + depositor.getUsername() + "余额：" + depositor.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Depositor query(Map<Integer, Depositor> map, Integer id) throws Exception {
        Set<Map.Entry<Integer, Depositor>> set = map.entrySet();
        for (Map.Entry<Integer, Depositor> entry : set) {
            if (entry.getKey() == id) {
                return entry.getValue();
            }

        }
        throw new Exception("账户不存在");
    }
}
