package cn.maidaotech.java07.chapter02.zonghe;
import java.util.Scanner;
// . 编写一个方法验证用户输入的手机号，
// 要求：11 位数字、只能以数字 1 开头，
// 第二位可以是数 字 3、5、6、7、8、9。
public class CheckPhone {
	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入您的手机号码");
		String mobil=sc.next();
		System.out.println("您输入的手机号码为:"+mobil);
		boolean b=validateMobile(mobil);
		if(b==true) {
		System.out.println("输入的手机号是合法的");
		}else {
		System.out.println("输入的手机号是非法的");
		}
	}
	public static boolean validateMobile(String mobil){
		char firstchar=mobil.charAt(0);
		char secondchar=mobil.charAt(1);
		boolean flag=false;
		if(mobil.length()==11&&firstchar=='1'&&(secondchar=='3'||
		secondchar=='5'||secondchar=='6'||secondchar=='7'||secondchar=='8'||secondchar=='9')) {
		flag = true;
		for(int i=2;i<mobil.length();i++) {
			char c=mobil.charAt(i);
			if(c<'0'||c>'9') {
				flag=false;
				return flag;
			}
		}		
	}
	return flag;
}
}


