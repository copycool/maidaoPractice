package cn.maidaotech.java07.work.chapter02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckEmail {
    /**
     * 2.验证邮箱是否符合规则：name@host，满足一下规则：
     * name 只能由字母、数字、下划线组成；
     *      只能以字母开头
     *      至少包含大写字母、小写字母、数字、下划线中的三种
     * host 中必须包含字符“.”，
     *      且“.”不能在host部分的两头
     * @param email
     * @return
     */
    public static boolean checkEmailIsTrue(String email){

        //判断email是不是null、""
        if (email == null || email == "" || !email.contains("@")) {
            System.out.println("输入的参数有误，请重新输入！！！");
            return false;
        }

        //截取字符串
        String[] arr =  email.split("@");
        String name = arr[0];
        String host = arr[1];

        //name是否至少包含大写字母、小写字母、数字、下划线中的三种
        if (!isAtLasteContainsThreeType(name)) {
            return false;
        }

        //name是否以字母开头
        if(!Character.isLetter(name.charAt(0))){
            System.out.println("name不是以字母开头");
            return false;
        }
        //判断host中是否包含".",且“.”不能在host部分的两头
        if (!host.contains(".") || host.startsWith(".") || host.endsWith(".")) {
            System.out.println("host中不包含'.'或host中'.'在host部分两头");
            return false;
        }
        System.out.println("输入的邮箱合法");
        return true;
    }


    //判断字符串是否至少包含大写字母、小写字母、数字、下划线中的三种
    public static boolean isAtLasteContainsThreeType(String str){
        int[] typeArr = new int[4];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 判断字符串是否由字母、数字、下划线组成
            if(!Character.isLetterOrDigit(c)){
                if ( c != '_') {
                    System.out.println("name不只由字母、数字、下划线组成,它是："+c);
                    return false;
                }
            }
            //判断是否出现了小写字母
            if (Character.isLowerCase(c)) {
                typeArr[0]++;
                continue;
            }
            //判断是否出现了大写字母
            if (Character.isUpperCase(c)) {
                typeArr[1]++;
                continue;
            }            
            //判断是否出现了数字
            if (Character.isDigit(c)) {
                typeArr[2]++;
                continue;
            }
            //判断是否出现了下划线
            if (c == '_') {
                typeArr[3]++;
                continue;
            }
        }
        //统计字符串由几种类型组成
        List<Integer> list = Arrays.stream(typeArr)             //将数组转换成stream流
                                   .filter(num->num!=0)         //过滤等于0的情况
                                   .boxed()                     //将int类型的stream转成了Integer类型的stream
                                   .collect(Collectors.toList());//收集
        if (list.size()<3) {
            System.out.println("name不包含至少大写字母、小写字母、数字、下划线中的三种");
            return false;
        }

        return true;
    }
}