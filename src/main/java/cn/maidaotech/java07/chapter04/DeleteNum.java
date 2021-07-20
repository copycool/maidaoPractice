package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//创建一个集合存入 20 个 10 以内的整数，
//遍历集合，删除所有指定数字的元素。
public class DeleteNum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();
        while(nums.size()<20){
            nums.add(random.nextInt((10-0)+0));
        }
        System.out.println("随机生成的数据为");
        System.out.println(nums);
        System.out.println("请输入您要删除的数据：");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
       
        if(nums.contains(d)){
            for(int i=0; i<nums.size(); i++){
                if(nums.get(i)==d){
                    nums.remove(i);
                }
            }
            System.out.println("删除成功！现在的数据为：");
            System.out.println(nums);
        }else{
            System.out.println("您要删除的数据不存在！");
        }
    }
    
}