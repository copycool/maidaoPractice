package cn.maidaotech.java07.chapter02.operator;

public class Practice07 {
    //打印出所有的“水仙花数”，即一个三位数，其各位数字的立方和等于该数本身，例如153
    public static void main(String[] args) {
        print(111);
        
    }
    public static void print(int num){
        int a = num/100;
        int b = num%100/10;
        int c = num%10;
        if (a*a*a+b*b*b+c*c*c == num) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}