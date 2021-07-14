package cn.maidaotech.java07.chapter02.zonghe;
//编译错
import java.util.Scanner;

// 验证邮箱是否符合规则：
// name@host，
// 满足一下规则：
//   name
// 	  只能由字母、数字、下划线组成； 
// 	  只能以字母开头 
// 	  至少包含大写字母、小写字母、数字、下划线中的三种 
//  host 
//    必须包含字符“.”，且“.”不能在host部分的两头
public class CheckEmail{
public static void main(String[] args){
	String letter = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
	String laN = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_");
	System.out.println("请输入您的邮箱：");
	Scanner scan = new Scanner(System.in);
	String Ins = scan.nextLine();
	
	String[] s1 = Ins.split(("\\.|@");
	String mail = s1.toString();

	String[] s2 = Ins.split("\\.");
	int i = s2[0].length()-1;

	int count = counter(laN,mail);
	int a = checkfirst(letter,mail);
	int b = checkremain(laN,mail);
	int c = checkdot(i,s2);

	if((count>=3)&a==1&b==1&c==1){
		System.out.println("邮箱合法");
	}else{
		System.out.println("邮箱不合法");
	}
}
	public  static int counter(String s1,String s2){
		int count=0;
		for(int i=0;i<s2.length()-1;i++){
			if(s1.contains(String.valueOf(s2.charAt(i)))){
				count++;
			}
	    }
		return count;
	}

	public static int checkfirst(String s1,String s2){
		if(s1.contains(String.valueOf(s2.charAt(0)))){
			return 1;
		}else{
			return 0;}
	}

	public static int checkremain(String s1,String s2){
		int k;
		for(int i=1;i<s2.length()-1;i++){
			if(s1.contains(String.valueOf(s2.charAt(i)))){
				k = 1;
			}else{
				k = 0;
			}
		}
		if(k==0){return 0;}else{return 1;}
	}

	

	public static int checkdot(int a,String Strings[]){
		//if((a[0].charAt(a)).equals("@")&(a[1].equals(""))){
			return 1;
		}
	}

	
 }		


	


	