package cn.maidaotech.java07.chapter06;

public class Practice02 {
    public static void main(String[] args) {
        print();
    }
    public static int print(){
        int i = 1;
        try {
            i=4;
            throw new Exception();
        } catch (Exception e) {
            i--;
        System.out.println("catch block:"+i);
        }finally{
            i=10;
            System.out.println("finally block:"+i);
        }

        return i;
    }
}