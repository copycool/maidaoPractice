package cn.maidaotech.java07.chapter02.answer;

public class Revert {
    //编写程序，将“I follow Bill Gate Tome Gate John Gate”中的“Gate”全部替换为“Gates”
    public static void main(String[] args) {
        String str = "I follow Bill Gate Tome Gate John Gate";
        str = str.replace("Gate", "Gates");
        str.replaceFirst("Gate", "Gates");  //替换第一个
        System.out.println(str);
    }
    
}