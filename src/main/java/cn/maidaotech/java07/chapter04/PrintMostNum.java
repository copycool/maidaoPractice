package cn.maidaotech.java07.chapter04;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//读取个数不定的正整数，
//打印频率最高的，如果有多个一样的最高频率则都输出。
public class PrintMostNum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println("以0结束您要输入的数据！");
        int num = sc.nextInt();
		while (num != 0) {
			if (map.get(num) == null) {//key传入的值，value值出现的次数
				map.put(num, 1);
			} else {
				int value = map.get(num);//要传入的值存在，重复次数+1
				map.put(num, value + 1);
			}
			num = sc.nextInt();
		}//map(输入的值num，值出现的次数value)
		Collection<Integer> v = map.values();//values()获取map的value集合
		Object[] vl = v.toArray();  //转value数组
		int len = vl.length, flag = 0;
		Arrays.sort(vl);
		Object max = vl[len - 1];
		Object k = null;
		for (Map.Entry entry : map.entrySet()) {
			if (max == entry.getValue()) {
				k = entry.getKey();
				System.out.println(k);
			}
		}
	}
}


// Set<Entry<T,V>>entrySet()
// 映射关系的集合


