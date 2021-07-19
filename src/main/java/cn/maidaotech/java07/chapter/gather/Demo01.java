package cn.maidaotech.java07.chapter.gather;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int num = sc.nextInt();
		while (num != 0) {
			if (map.get(num) == null) {
				map.put(num, 1);
			} else {
				int value = map.get(num);
				map.put(num, value + 1);
			}
			num = sc.nextInt();
		}
		Collection<Integer> v = map.values();
		Object[] vl = v.toArray();
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

