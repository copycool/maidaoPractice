package cn.maidaotech.java07.Test;



public class AnyTest {
    public static void main(String[] args){
        int result = test4();
        System.out.println(result);
    }
    public static int test4(){
        //try 语句块中有 return 语句时的整体执行顺序
        int i = 1;
        try{
            i++;
            System.out.println("try block, i = "+i);
            return i++;
        }catch(Exception e){
            i ++;
            System.out.println("catch block i = "+i);
            return i;
        }finally{
            i++;
            System.out.println("finally block i = "+i);
        }
    }
   
}
