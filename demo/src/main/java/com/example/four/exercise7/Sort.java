package com.example.four.exercise7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sort {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        
		Set<String> text=new HashSet<String>();//开始先把单词输入到Set集合中
		String a;
		while(!(a=in.next()).equals("!!!!!"))
		{
			text.add(a);
		}
		System.out.println(text.size());//输出不重复的单词数量，即Set集合中存储的所有元素的数量
		String[] b = text.toArray(new String[text.size()-1]);//将Set中的元素返回到数组b中
		ArrayList<String> text2=new ArrayList<String>();
		for(int i=0;i<text.size();i++) text2.add(b[i]);//为了方便排序，再将数组b中的元素一一存到ArrayList集合中
		text2.sort(null);
		for(int i=0;i<10;i++)//将ArrayList集合中排好序的元素输出前十个
		{
			System.out.println(text2.get(i));
		}
	}


}