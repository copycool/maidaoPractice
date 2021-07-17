package cn.maidaotech.java07.chapter02.section267;

import java.util.Scanner;
import java.lang.String;
//将字符串转成数组：toCharArray()
public class StringReverse {
    public static void main(String[] args) {
        
  
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您要反转的字符串:");
    String str = sc.next();
    StringReverseOne(str);
    StringReverseTwo(str);
    StringReverseThree(str);

    }

	public static void StringReverseOne(String r){		//方法一元素交换
		char[] arr =r.toCharArray();     //通过String中的toCharArray方法,把字符串转为数组
		for (int i = 0; i < (arr.length)/2; i++) { 	
			char temp =arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		String a = new String(arr);		//将数组转为字符串
		System.out.println(a); 	
	}

	public static void StringReverseTwo(String r){     //方法二Stringbuffer中的方法reverse;
		StringBuffer sbf =new StringBuffer(r); 
		System.out.println(sbf.reverse());
	}

	public static void StringReverseThree(String r){  //方法三: 倒序遍历输出
		char [] arr = r.toCharArray();   
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]);
		}
		
	}
}
