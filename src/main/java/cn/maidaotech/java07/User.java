package cn.maidaotech.java07;

public class User {
    

    private static User u;

    public static void main(String[] args) {
        User u = new User();
        u.fun();
        fun2();
        int b = User.fun3();

    }

    public  void fun() {
        System.out.println("成功调用");
    }
    public static void fun2(){
        System.out.println("成功调用静态方法");
    }
    public static int fun3(){
        System.out.println("成功调用静态方法");
        int a =10;
        return a;
    }
    
}