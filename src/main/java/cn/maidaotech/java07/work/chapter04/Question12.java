package cn.maidaotech.java07.work.chapter04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Question12 {
    private static HashMap<Integer,User> map = new HashMap<>();

    static {
        //初始化数据，生成10个用户
        for (int i = 0; i < 10; i++) {
            map.put(i+1,new User(i+1,"user_"+(i+1),BigDecimal.valueOf(new Random().nextInt(100000)+1)));
        }
    }

    public static void main(String[] args) {
        map.keySet().stream().forEach(key-> System.out.println(map.get(key).toString()));
        System.out.println(getCalance(12)+"元");
    }


    //根据储户ID获取其余额信息。
    public static BigDecimal getCalance(Integer id ){
        Set<Integer> set = map.keySet();
        if (!set.contains(id)){
            throw new RuntimeException("该用户不存在");
        }
        for (Integer num:set) {
            if (num == id){
                return map.get(id).getBalance();
            }
        }
        return  BigDecimal.ZERO;
    }
}
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
class User{
    private Integer id;
    private String name;
    private BigDecimal balance;

}