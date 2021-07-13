package cn.maidaotech.java07.chapter02;

public class RewriteWordes {
    //编写程序，将“I follow Bill Gate Tome Gate John Gate”中的“Gate”全部替换为“Gates”
    public static void main(String[] args) {
        String str = "I follow Bill Gate Tome Gate John Gate";
        String newStr = str.replace("Gate","Gates");
        System.out.println(newStr);
    }
}