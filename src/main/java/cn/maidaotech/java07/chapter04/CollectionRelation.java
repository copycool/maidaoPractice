package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//如何判断两个集合是否 有交集，
//并打印出他们的交集、并集和差集。
public class CollectionRelation {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> intersect = new ArrayList<>();
		fillList(list1, 5, 0, 20);
		System.out.println("********集合A如下：********");
		System.out.println(list1);
		fillList(list2, 10, 0, 20);
		System.out.println("********集合B如下：********");
		System.out.println(list2);
		isHasIntersect(list1, list2);

	}

	public static void fillList(List<Integer> list, int count, int min, int max){
		Random random = new Random();
		while(list.size()<count){
			int k = random.nextInt((max-min)+min);
			if(!list.contains(k)){
				list.add(k);
			}
		}
	}

	public static void isHasIntersect(List<Integer> a, List<Integer> b) {
		List<Integer> c = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (a.get(i) == b.get(j)) {
					c.add(a.get(i));
				}
			}
		}
		if (c.size() == 0) {
			System.out.println("集合A、B无交集！");
		} else {
			System.out.println("********A、B交集如下：********");
			System.out.println(c);
		}
		printUnion(a, b, c);

	}

	public static void printUnion(List<Integer> a, List<Integer> b, List<Integer> c) {
		List<Integer> union = new ArrayList<>();
		List<Integer> diff = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			union.add(a.get(i));
		}
		for (int i = 0; i < b.size(); i++) {
			union.add(b.get(i));
		}
		System.out.println("集合A、B的并集为：");
		System.out.println(union);
		int count = 0;
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < union.size(); j++) {
				if (c.get(i) == union.get(j) & count < 1) {
					union.remove(j);
					count++;
				}
			}
		}
		System.out.println("集合A、B的差集为：");
		System.out.println(union);
	}

}