package cn.maidaotech.java07.chapter04;

import java.util.HashMap;
import java.util.Map;

public class DepositorTest {
    private static Map<Long,Depositor> depositors = new HashMap<>();
    private static void init() {
        for (int i = 0; i < 10; i++) {
            Long id = i + 5L;
            Depositor depositor = new Depositor(id, "qiqi ", i +100);
            depositors.put(id, depositor);
        }
      
    }
  
public static void main(String[] args) {
    init();
    System.out.println(depositors.get(5L).toString());
}

}