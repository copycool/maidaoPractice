package cn.maidaotech.java07.chapter04.practice.practice12;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Map<Long, DepositorInfo> depositors = new HashMap<Long, DepositorInfo>();
    static {
        init();
    }

    private static void init() {
        for (int i = 0; i < 40; i++) {
            Long id = i + 10L;
            DepositorInfo depositorInfo = new DepositorInfo(id, "peas" + i, i + 0.1);
            depositors.put(id, depositorInfo);
        }
    }

    public static void main(String[] args) {
        System.out.println(depositors.get(10L).toString());
    }

}