package cn.maidaotech.java07.chapter4.question7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//将如下英文其中的单词按照字母排序后打印输出
//Plain  TextThe identifier of the encoding used to encode the bytes in value.
public class SortOutput {
    public static void main(String[] args) {
        String str = "The identifier of the encoding used a to encode the bytes in value";
        /*for(int i = 0; i <= str.length()-1;i ++){//遍历字符串
                char ch;
                if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){//判断字符是否在A-Z之间（大写）
                    ch = (char) (str.charAt(i)+32);
            }
            str.indexOf("T");
        }*/

        String[] splitStr = str.split(" ");
        

        List<String> list1 = Arrays.stream(splitStr).collect(Collectors.toList());
        System.out.println("排序前："+list1);
        

        List<String> collect = Arrays.stream(splitStr).sorted().collect(Collectors.toList());
        System.out.println("排序后："+collect );

        }
}