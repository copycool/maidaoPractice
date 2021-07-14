package cn.maidaotech.java07.work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.text.StrBuilder;

public class SingleShuDu {
    
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        checkIsTrue();
        Long endTime = System.currentTimeMillis();
        System.out.println("运行时间为："+(endTime-startTime)+"ms");
    }

    /**
     * 方法一：
     * 编程在以下空白处填入数字，要求数字不重复
     * @return
     */
    public static boolean checkIsTrue(){
        Integer[] numArr = {3,0,4,6,0,2,0,0,0};
        List<Integer> list = Arrays.stream(numArr).filter(num->num!=0).collect(Collectors.toList());
        for (int i = 1; i <= 9; i++) {
            if (list.contains(i)) {
                continue;
            }
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[j] == 0) {
                    numArr[j] = i;
                    list.add(i);
                    break;
                }
            }
        }
        //打印数组  
        printArr(numArr);

        return true;
    }
    public static void printArr(Integer[] target){
        StrBuilder numStr = new StrBuilder("{");
        for (int i = 0; i < target.length; i++) {
            if (i == target.length-1) {
                numStr.append(target[i]+"}");
                System.out.println(numStr);
                break;
            }
            numStr.append(target[i]+",");
        }
    }
}
