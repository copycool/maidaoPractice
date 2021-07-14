package cn.maidaotech.java07;
//打印出所有的“水仙花数”，即一个三位数，其各位数字的立方和等于该数本身，例如153
public class DaffodilTest {
    public static void main(String[] args) {
        for (int j = 100; j < 1000; j++) {
            int g=j%10; 
	        int s=j/10%10;  
	        int b=j/100;  
	        if(g*g*g+s*s*s+b*b*b==j) {
	System.out.println(j+"是水仙花数");
        }
    }
    }}