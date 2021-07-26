package cn.maidaotech.java07.chapter02.string;

public class Practice04 {
    //编写程序，将“I follow Bill Gate Tome Gate John Gate”中的“Gate”全部替换为“Gates”
    public static void main(String[] args) {
        String str = "I follow Bill Gate Tome Gate John Gate";
        System.out.println(str.replace("Gate", "Gates"));
    }
    
}