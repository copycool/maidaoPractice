package cn.maidaotech.java07.chapter01;

public class Revert {
    public static void main(String[] args) {
        String str = "I follow Bill Gate Tome Gate John Gate";
        str = str.replace("Gate", "Gates");
        str.replaceFirst("Gate", "Gates");
        System.out.println(str);
    }
}
