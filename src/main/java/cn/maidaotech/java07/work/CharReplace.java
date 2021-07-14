package cn.maidaotech.java07.work;

/**
 * 替换字符
 */
public class CharReplace {
    public static void main(String[] args) {
        String srcs = "I follow Bill Gate Tome Gate John Gate";

        String res = srcs.replaceAll("Gate", "Gates");

        System.out.println(res);
    }
}