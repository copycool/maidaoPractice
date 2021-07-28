package cn.maidaotech.java07.chapter06;

public class Practice03 {
    public static void main(String[] args) {
        print();
    }
    public static int print(){
        int i = 1;
        try {
            i++;
            System.out.println("try block:"+i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch block:"+i);
            return i;
        }finally{
            i++;
            System.out.println("finally block:"+i);
            return i;
        }
    }
}