package cn.maidaotech.java07.syncaddlock.forefunctioninterface;

import java.util.function.Predicate;

/**
* 断定型接口(Predicate)：有一个输入参数，返回值只能是 布尔值！ 
*/
public class Demo02 {
    public static void main(String[] args) {
        //判断字符串是合法为空
        // Predicate<String> predicate = new Predicate<String>(){
        //     @Override
        //     public boolean test(String t) {
        //         return t.isEmpty();
        //     }
            
        // };

        Predicate<String> predicate = str->{return str.isEmpty();};
        System.out.println(predicate.test("as"));
    }
}