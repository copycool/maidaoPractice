package cn.maidaotech.java07.chapter02.section267;
import java.util.Scanner;

// 编程检测用户名的合法性，用户名需满足以下条件： 
// a. 长度 8 到 20 个字符 
// b. 只能英文、数字、下划线 
// c. 必须以字母开头
public class CheckUsername {
    public static void main(String[] args){
        
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名:");
            String name=sc.nextLine();
            boolean b=validateUsername(name);
        
        
        if(b==true){
            System.out.println("输入正确");
        }else{
            System.out.println("非法输入");
        
        }
    }
    public static boolean validateUsername(String name){
		String firstchar=String.valueOf(name.charAt(0));
        String letter = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String content = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_");
		boolean flag=false;

		if(name.length()>=8&name.length()<=20&letter.contains(firstchar)) {
		flag = true;
		for(int i=2;i<name.length();i++) {
			String c=String.valueOf(name.charAt(i));
			if(content.contains(c)) {
				flag = true;
			}else{
                flag = false;
                break;  
            } 
		}		
	}
    return flag;
}
	
}
