package cn.maidaotech.java07.chapter02.zonghe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 验证邮箱是否符合规则：
// name@host，
// 满足一下规则：
//   name
// 	  只能由字母、数字、下划线组成； 
// 	  只能以字母开头 
// 	  至少包含大写字母、小写字母、数字、下划线中的三种 
//  host 
//    必须包含字符“.”，且“.”不能在host部分的两头
// 封装
public class CheckEmail {
    private static final Pattern EMAIL_CHECKER = Pattern
            .compile("^([a-z0-9A-Z]+[-|\\._]?)+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");

    public static void main(String[] args) {
        System.out.println(checkEmail("Like2020@maidaotech.cn"));
        System.out.println(checkEmail("Li_ke@maidaotech.cn"));
        System.out.println(checkEmail("like2020@maidaotech.cn"));
        System.out.println(checkEmail("like@maidaotech.cn"));
        System.out.println(checkEmail("123fff@qq.com"));

    }

    /**
     * 方法一：正则表达式
     * 
     * @param input
     * @return
     */
    public static boolean isEmail(String input) {
        if (input == null) {
            return false;
        }
        int len = input.length();
        if (len == 0 || len > 64) {
            return false;
        }
        Matcher matcher = EMAIL_CHECKER.matcher(input);
        return matcher.matches();
    }

    /**
     * 方法二
     * 
     * @param email
     * @return
     */
    public static boolean checkEmail(String email) {
        if (email == null || email.indexOf("@") == -1) {
            return false;
        }
        String[] nameHost = email.split("@");
        int index = 0;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasUnderline = false;
        while (index < nameHost[0].length()) {
            char c = nameHost[0].charAt(index);
            if (index == 0 && !isAlpha(c)) {
                return false;
            }
            if (!isAlphaOrNumber(c) && c != 95) {
                return false;
            }
            if (isLowerAlpha(c)) {
                hasLower = true;
            }
            if (isUpperAlpha(c)) {
                hasUpper = true;
            }
            if (isNumber(c)) {
                hasNumber = true;
            }
            if (c == 95) {
                hasUnderline = true;
            }
            index++;
        }
        int types = 0;
        if (hasLower) {
            types++;
        }
        if (hasUpper) {
            types++;
        }
        if (hasUnderline) {
            types++;
        }
        if (hasNumber) {
            types++;
        }
        if (types < 3) {
            return false;
        }
        int dotIndex = nameHost[1].indexOf('.');
        if (dotIndex <= 0 || dotIndex == nameHost[1].length() - 1) {
            return false;
        }
        return true;
    }

    private static boolean isAlphaOrNumber(char c) {
        if (isAlpha(c) || isNumber(c)) {
            return true;
        }
        return false;
    }

    private static boolean isAlpha(char c) {
        if (isLowerAlpha(c) || isUpperAlpha(c)) {
            return true;
        }
        return false;
    }

    private static boolean isUpperAlpha(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }
        return false;
    }

    private static boolean isLowerAlpha(char c) {
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }

    private static boolean isNumber(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        }
        return false;
    }
}


// public static void main(String[] args){
// 	String letter = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
// 	String laN = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_");
// 	System.out.println("请输入您的邮箱：");
// 	Scanner scan = new Scanner(System.in);
// 	String Ins = scan.nextLine();
	
// 	String[] s1 = Ins.split(("\\.|@");
// 	String mail = s1.toString();

// 	String[] s2 = Ins.split("\\.");
// 	int i = s2[0].length()-1;

// 	int count = counter(laN,mail);
// 	int a = checkfirst(letter,mail);
// 	int b = checkremain(laN,mail);
// 	int c = checkdot(i,s2);

// 	if((count>=3)&a==1&b==1&c==1){
// 		System.out.println("邮箱合法");
// 	}else{
// 		System.out.println("邮箱不合法");
// 	}
// }
// 	public  static int counter(String s1,String s2){
// 		int count=0;
// 		for(int i=0;i<s2.length()-1;i++){
// 			if(s1.contains(String.valueOf(s2.charAt(i)))){
// 				count++;
// 			}
// 	    }
// 		return count;
// 	}

// 	public static int checkfirst(String s1,String s2){
// 		if(s1.contains(String.valueOf(s2.charAt(0)))){
// 			return 1;
// 		}else{
// 			return 0;}
// 	}

// 	public static int checkremain(String s1,String s2){
// 		int k;
// 		for(int i=1;i<s2.length()-1;i++){
// 			if(s1.contains(String.valueOf(s2.charAt(i)))){
// 				k = 1;
// 			}else{
// 				k = 0;
// 			}
// 		}
// 		if(k==0){return 0;}else{return 1;}
// 	}

	

// 	public static int checkdot(int a,String Strings[]){
// 		//if((a[0].charAt(a)).equals("@")&(a[1].equals(""))){
// 			return 1;
// 		}
// 	}

	
//  }		


	


	