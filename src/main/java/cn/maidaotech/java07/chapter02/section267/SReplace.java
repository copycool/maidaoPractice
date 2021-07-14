package cn.maidaotech.java07.chapter02.section267;
//编写程序，
// 将“I follow Bill Gate Tome Gate John Gate”
// 中的“Gate”全部替换为“Gates”
public class SReplace {
    public static void main(String[] args) {
        String str = new String("I follow Bill Gate Tome Gate John Gate");
        String str1 = str.replace("Gate", "Gates");
        System.out.println(str1);


    }
}