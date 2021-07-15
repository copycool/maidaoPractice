package cn.maidaotech.java07;

public class replace {
    public static void main(String[] args) {
        String str = "I follow Bill Gate Tome Gate Join Gate";
        String str1 = str.replace("Gate", "Gates");
        System.out.println(str1);
        //str.replaceFirst(regex, replacement)   获取第一个
    }
}
