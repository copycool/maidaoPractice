package cn.maidaotech.java07;

public class CharReplace {
    public static void main(String[] args){
        String str = new String("I follow Bill Gate Tome Gate John Gate");
        System.out.println("String="+str);
        String str1 = str.replace("Gate" ,"Gates");
        System.out.println("replaceString=" +str1);
    }
    
}